/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.service.impl;

import com.cvbuilder.dao.TemplateCvRepository;
import com.cvbuilder.dto.TemplateCvDTO;
import com.cvbuilder.entities.TemplateCv;
import com.cvbuilder.mapper.GenericMapper;
import com.cvbuilder.service.TemplateCvService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marko
 */
@Service
public class TemplateCvServiceImpl implements TemplateCvService{
    
    @Autowired
    GenericMapper mapper;
    @Autowired
    private TemplateCvRepository repository;
    
    public TemplateCvDTO createATemplate(TemplateCvDTO templateCv) {
        TemplateCv tempCv = mapper.templateCvDTOToTemplateCv(templateCv);
        return mapper.templateCvToTemplateCvDTO(repository.save(tempCv));
    }
    
    public TemplateCvDTO updateTemplate(TemplateCvDTO templateCv) {
        TemplateCv tempCv = mapper.templateCvDTOToTemplateCv(templateCv);
        return mapper.templateCvToTemplateCvDTO(repository.save(tempCv));
    }
    public List<TemplateCvDTO> findAll() {
        List<TemplateCv> users = repository.findAll();
        List<TemplateCvDTO> usersDTO = new ArrayList<>();
        for (TemplateCv user : users) {
            usersDTO.add(mapper.templateCvToTemplateCvDTO(user));
        }
        return usersDTO;
    }
    
    public void deleteTemplate(Long tempID) {
        repository.deleteById(tempID);
    }
    
     public List<TemplateCvDTO> returnTemplatesForUser(Long userID) {
        List<TemplateCv> templatesList = repository.returnTemplatesForUser(userID);
        List<TemplateCvDTO> templatesDTO = new ArrayList<>();
        for (TemplateCv t : templatesList) {
            templatesDTO.add(mapper.templateCvToTemplateCvDTO(t));
        }
        return templatesDTO;
    }
}
