package com.example.CVBuilder.service;


import com.example.CVBuilder.dao.TemplateCvSectionRepository;
import com.example.CVBuilder.dto.TemplateCvSectionDTO;
import com.example.CVBuilder.dto.TemplateParamDTO;
import com.example.CVBuilder.dto.UserDTO;
import com.example.CVBuilder.entities.TemplateCvSection;
import com.example.CVBuilder.entities.TemplateParam;
import com.example.CVBuilder.entities.User;
import com.example.CVBuilder.mapper.GenericMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marko
 */

@Service
public class TemplateCvSectionService {
    @Autowired
    GenericMapper mapper;
    @Autowired
    private TemplateCvSectionRepository repository;
    
    public List<TemplateCvSectionDTO> findAll() {
        List<TemplateCvSection> tempCvSections = repository.findAll();
        List<TemplateCvSectionDTO> tempCvSectionsDTO = new ArrayList<>();
        for (TemplateCvSection tempCvSection : tempCvSections) {
            tempCvSectionsDTO.add(mapper.templateCvSectionToTemplateCvSectionDTO(tempCvSection));
        }
        return tempCvSectionsDTO;
    }
    
    public TemplateCvSectionDTO saveTemplateWithSections(TemplateCvSectionDTO templateCvSectionDTO) {
        TemplateCvSection templateCvSection = mapper.templateCvSectionDTOToTemplateCvSection(templateCvSectionDTO);
        return mapper.templateCvSectionToTemplateCvSectionDTO(repository.save(templateCvSection));
    }
    
    public TemplateCvSectionDTO updateTemplateWithSections(TemplateCvSectionDTO templateCvSectionDTO) {
        TemplateCvSection templateCvSection = mapper.templateCvSectionDTOToTemplateCvSection(templateCvSectionDTO);
        return mapper.templateCvSectionToTemplateCvSectionDTO(repository.save(templateCvSection));
    }
    
    public List<TemplateCvSectionDTO> returnTemplateWithSections(Long tempID) {
        List<TemplateCvSection> tempSections = repository.returnTemplateWithSections(tempID);
        List<TemplateCvSectionDTO> tempSectionsDTO = new ArrayList<>();
        for (TemplateCvSection ts : tempSections) {
            tempSectionsDTO.add(mapper.templateCvSectionToTemplateCvSectionDTO(ts));
        }
        return tempSectionsDTO;
    }
    
    public void deleteSectionFromTemplate(Long tempSectionID) {
        repository.deleteById(tempSectionID);
    }

  
}
