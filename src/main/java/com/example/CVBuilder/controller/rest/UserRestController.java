/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.controller.rest;

import com.example.CVBuilder.dto.UserDTO;
import com.example.CVBuilder.exceptions.UserNotFoundException;
import com.example.CVBuilder.exceptions.UserAlreadyExistsException;
import com.example.CVBuilder.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marko
 */
@RestController
public class UserRestController {

    @Autowired
    UserService service;

    @GetMapping("/users")
    public @ResponseBody
    List<UserDTO> vratiSveKorisnike() {
        return service.findAll();
    }

    @GetMapping("/getUser/{id}")
    public @ResponseBody
    UserDTO vratiUsera(@PathVariable Long id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody
    Object login(@RequestBody UserDTO user) throws UserNotFoundException {
        UserDTO userLogin = (UserDTO) service.login(user);
        if (userLogin != null) {
            return ResponseEntity.status(HttpStatus.OK).body(userLogin);
        }
        throw new UserNotFoundException("User not found");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody
    Object register(@RequestBody UserDTO user) {
        if (!service.existsByUsername(user)) {
            return service.register(user);
        }
        throw new UserAlreadyExistsException("Username is already taken.");
    }
}
