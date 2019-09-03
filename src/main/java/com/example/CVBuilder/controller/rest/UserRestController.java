/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.controller.rest;

import com.example.CVBuilder.dto.UserDTO;
import com.example.CVBuilder.entities.User;
import com.example.CVBuilder.service.UserService;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marko
 */
@RestController
@CrossOrigin
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
    

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody
    Object login(@RequestBody UserDTO user) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.login(user));
        }catch (SQLIntegrityConstraintViolationException  e) {
            //uhvati duplicate entry for key exception
            System.out.println("User already exist");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User already existper");
            
        }
        catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greska. Ne postoji takav korisnik.");

        }
    }
    @CrossOrigin
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody
    Object register(@RequestBody UserDTO user) {
        try {
            return service.register(user);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greska. Ne postoji takav korisnik.");

        }
    }
}
