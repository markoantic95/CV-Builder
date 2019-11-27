/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.service.impl;

import com.example.CVBuilder.dao.TemplateSectionRepository;
import com.example.CVBuilder.dto.TemplateSectionDTO;
import com.example.CVBuilder.entities.TemplateSection;
import com.example.CVBuilder.mapper.GenericMapper;
import com.example.CVBuilder.service.TemplateSectionService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marko
 */

@Service
public class TemplateSectionServiceImpl implements TemplateSectionService{
    @Autowired
    GenericMapper mapper;
    @Autowired
    private TemplateSectionRepository repository;
    
    public List<TemplateSectionDTO> returnAllSections() {
        List<TemplateSection> tempSections = repository.findAll();
        List<TemplateSectionDTO> tempSectionsDTO = new ArrayList<>();
        for (TemplateSection tempSection : tempSections) {
            tempSectionsDTO.add(mapper.templateSectionToTemplateSectionDTO(tempSection));
        }
        return tempSectionsDTO;
    }
}
