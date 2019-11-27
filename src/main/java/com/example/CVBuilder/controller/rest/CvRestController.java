/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.controller.rest;

import com.example.CVBuilder.dto.CvDTO;
import com.example.CVBuilder.service.CvService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
public class CvRestController {
    @Autowired
    CvService service;
    
    @RequestMapping(value = "/createACV", method = RequestMethod.POST)
    public @ResponseBody
    Object createACV(@RequestBody CvDTO cv) {
        try {
            return service.createACV(cv);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Greska.");

        }
    }
    
    @GetMapping("/cvsForUser")
    public @ResponseBody
    Object returnCVsForUser(@RequestParam(value = "userID") Long userID) {
        List<CvDTO> temp= service.returnCVsForUser(userID);
        return ResponseEntity.status(HttpStatus.OK).body(temp);

    }
    
    @RequestMapping(value = "deleteCV", method = RequestMethod.DELETE)
    public void deleteCV(@RequestParam Long cvID) {
        service.deleteCV(cvID);
    }
}
