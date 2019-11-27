/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.service.impl;

import com.example.CVBuilder.dao.TemplateSectionParamRepository;
import com.example.CVBuilder.dto.TemplateCvSectionDTO;
import com.example.CVBuilder.dto.TemplateSectionParamDTO;
import com.example.CVBuilder.entities.TemplateCvSection;
import com.example.CVBuilder.entities.TemplateSectionParam;
import com.example.CVBuilder.mapper.GenericMapper;
import com.example.CVBuilder.service.TemplateSectionParamService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marko
 */

@Service
public class TemplateSectionParamServiceImpl implements TemplateSectionParamService{
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
