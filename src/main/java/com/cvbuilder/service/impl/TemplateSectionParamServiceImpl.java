/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.service.impl;

import com.cvbuilder.dao.TemplateSectionParamRepository;
import com.cvbuilder.dto.TemplateSectionParamDTO;
import com.cvbuilder.mapper.GenericMapper;
import com.cvbuilder.service.TemplateSectionParamService;
import com.cvbuilder.entities.TemplateSectionParam;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marko
 */

@Service
public class TemplateSectionParamServiceImpl implements TemplateSectionParamService {
    @Autowired
    GenericMapper mapper;
    @Autowired
    private TemplateSectionParamRepository repository;
    
    public List<TemplateSectionParamDTO> findAll() {
        List<TemplateSectionParam> tempSectionParams = repository.findAll();
        List<TemplateSectionParamDTO> tempSectionParamsDTO = new ArrayList<>();
        for (TemplateSectionParam tempSectionParam : tempSectionParams) {
            tempSectionParamsDTO.add(mapper.templateSectionParamToTemplateSectionParamDTO(tempSectionParam));
        }
        return tempSectionParamsDTO;
    }
    
//    public List<TemplateSectionParamDTO> findAll() {
//        List<TemplateSectionParam> tempSections = repository.findAll();
//        List<TemplateSectionParamDTO> tempSectionsDTO = new ArrayList<>();
//        for (TemplateSectionParam tempSection : tempSections) {
//            tempSectionsDTO.add(mapper.templateSectionParamToTemplateSectionParamDTO(tempSection));
//        }
//        return tempSectionsDTO;
//    }
    
}
