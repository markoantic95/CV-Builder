/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.service.impl;

import com.cvbuilder.dao.TemplateSectionRepository;
import com.cvbuilder.dto.TemplateSectionDTO;
import com.cvbuilder.entities.TemplateSection;
import com.cvbuilder.mapper.GenericMapper;
import com.cvbuilder.service.TemplateSectionService;
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
