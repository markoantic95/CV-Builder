/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.controller.rest;

import com.example.CVBuilder.dto.TemplateCvSectionDTO;
import com.example.CVBuilder.dto.TemplateParamDTO;
import com.example.CVBuilder.dto.UserDTO;
import com.example.CVBuilder.service.TemplateCvSectionService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
public class TemplateCvSectionRestController {

    @Autowired
    TemplateCvSectionService service;

    @GetMapping("/templateCvSection")
    public @ResponseBody
    List<TemplateCvSectionDTO> returnAllTemplateCvSections() {
        return service.findAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/saveTemplateWithSections", method = RequestMethod.POST)
    public @ResponseBody
    Object saveTemplateWithSections(@RequestBody TemplateCvSectionDTO templateSection) {
        try {
            return service.saveTemplateWithSections(templateSection);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Greska.");

        }
    }

    @CrossOrigin
    @RequestMapping(value = "/saveTemplateWithSections1", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public @ResponseBody
    Object saveTemplateWithSections1(@RequestBody List<TemplateCvSectionDTO> templateSectionsList) {
        boolean success = true;
         List<TemplateCvSectionDTO> tempSecList = new LinkedList<TemplateCvSectionDTO>();
        for (TemplateCvSectionDTO tempCvSectDTO : templateSectionsList) {
            try {
               tempSecList.add(service.saveTemplateWithSections(tempCvSectDTO));
            } catch (Exception ex) {
                success = false;
                
            }
        }
        if(success==true){
            return ResponseEntity.status(HttpStatus.OK).body(tempSecList);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Greska.");
    }



@CrossOrigin
        @RequestMapping(value = "/updateTemplateWithSections", method = RequestMethod.PUT)
        public @ResponseBody
    Object updateTemplateWithSections(@RequestBody TemplateCvSectionDTO templateSection) {
        try {
            return service.updateTemplateWithSections(templateSection);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greska.");

        }
    }

    @GetMapping("/templateWithSections")
        public @ResponseBody
    Object returnTemplateWithSections(@RequestParam Long tempID) {
        List<TemplateCvSectionDTO> tempSecList = service.returnTemplateWithSections(tempID);
        return ResponseEntity.status(HttpStatus.OK).body(tempSecList);

    }

    @CrossOrigin
        @RequestMapping(value = "deleteSectionFromTemplate", method = RequestMethod.DELETE)
        public void deleteTemplate(@RequestParam Long tempSectionID) {
        service.deleteSectionFromTemplate(tempSectionID);
    }
}
