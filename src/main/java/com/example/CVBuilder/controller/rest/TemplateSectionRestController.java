/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.controller.rest;

import com.example.CVBuilder.dto.TemplateSectionDTO;
import com.example.CVBuilder.service.TemplateSectionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marko
 */

@RestController
@CrossOrigin
public class TemplateSectionRestController {
    @Autowired
    TemplateSectionService service;

    @GetMapping("/sections")
    public @ResponseBody
    List<TemplateSectionDTO> returnAllSections() {
        return service.returnAllSections();
    }
}
