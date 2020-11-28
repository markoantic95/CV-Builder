/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.service.impl;

import com.cvbuilder.dao.TemplateParamRepository;
import com.cvbuilder.dto.TemplateParamDTO;
import com.cvbuilder.entities.TemplateParam;
import com.cvbuilder.mapper.GenericMapper;
import com.cvbuilder.service.TemplateParamService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marko
 */

@Service
public class TemplateParamServiceImpl implements TemplateParamService{
    
    @Autowired
    GenericMapper mapper;
    @Autowired
    private TemplateParamRepository repository;
    
    public List<TemplateParamDTO> findAll() {
        List<TemplateParam> tempParams = repository.findAll();
        List<TemplateParamDTO> tempParamsDTO = new ArrayList<>();
        for (TemplateParam tempParam : tempParams) {
            tempParamsDTO.add(mapper.templateParamToTemplateParamDTO(tempParam));
        }
        return tempParamsDTO;
    }
    
    public List<TemplateParamDTO> returnParamsForSectionID(Long sectionID) {
        List<TemplateParam> params = repository.returnParamsForSectionID(sectionID);
        List<TemplateParamDTO> paramsDTO = new ArrayList<>();
        for (TemplateParam p : params) {
            paramsDTO.add(mapper.templateParamToTemplateParamDTO(p));
        }
        return paramsDTO;
    }
}
