/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.controller.rest;

import com.cvbuilder.dto.TemplateParamDTO;
import com.cvbuilder.service.TemplateParamService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marko
 */

@RestController
public class TemplateParamRestController {
    @Autowired
    TemplateParamService service;

    @GetMapping("/params")
    public @ResponseBody
    List<TemplateParamDTO> returnAllParams() {
        return service.findAll();
    }
    
    @GetMapping("/ParamsForSectionID")
    public @ResponseBody
    Object returnParamsForSectionID(@RequestParam(value = "sectionID") Long sectionID) {
        List<TemplateParamDTO> tempParam = service.returnParamsForSectionID(sectionID);
        return ResponseEntity.status(HttpStatus.OK).body(tempParam);

    }
}
