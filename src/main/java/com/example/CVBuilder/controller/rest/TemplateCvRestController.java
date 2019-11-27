/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.controller.rest;

import com.example.CVBuilder.dto.TemplateCvDTO;
import com.example.CVBuilder.service.TemplateCvService;
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
public class TemplateCvRestController {
    @Autowired
    TemplateCvService service;
    
    @RequestMapping(value = "/createATemplate", method = RequestMethod.POST)
    public @ResponseBody
    Object createATemplate(@RequestBody TemplateCvDTO templateCv) {
        try {
            return service.createATemplate(templateCv);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Greska.");
        }
    }
    
    @RequestMapping(value = "/updateTemplate", method = RequestMethod.PUT)
    public @ResponseBody
    Object updateTemplate(@RequestBody TemplateCvDTO templateCv) {
        try {
            return service.updateTemplate(templateCv);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greska.");
        }
    }
    
    @GetMapping("/templates")
    public @ResponseBody
    List<TemplateCvDTO> returnAllTemplates() {
        return service.findAll();
    }
    @RequestMapping(value = "deleteTemplate", method = RequestMethod.DELETE)
    public void deleteTemplate(@RequestParam Long tempID) {
        service.deleteTemplate(tempID);
    }
    
    @GetMapping("/templatesForUser")
    public @ResponseBody
    Object returnTemplatesForUser(@RequestParam(value = "userID") Long userID) {
        List<TemplateCvDTO> temp= service.returnTemplatesForUser(userID);
        return ResponseEntity.status(HttpStatus.OK).body(temp);

    }
    
    
}
