/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.service.impl;

import com.example.CVBuilder.dao.CvRepository;
import com.example.CVBuilder.dao.TemplateCvRepository;
import com.example.CVBuilder.dto.CvDTO;
import com.example.CVBuilder.dto.TemplateCvDTO;
import com.example.CVBuilder.entities.Cv;
import com.example.CVBuilder.entities.TemplateCv;
import com.example.CVBuilder.mapper.GenericMapper;
import com.example.CVBuilder.service.CvService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marko
 */
@Service
public class CvServiceImpl implements CvService{
    @Autowired
    GenericMapper mapper;
    @Autowired
    private CvRepository repository;
    
    public CvDTO createACV(CvDTO cvDTO) {
        Cv cv = mapper.CvDTOToCv(cvDTO);
        return mapper.CvToCvDTO(repository.save(cv));
    }
    
    public List<CvDTO> returnCVsForUser(Long userID) {
        List<Cv> cvsList = repository.returnCVsForUser(userID);
        List<CvDTO> cvsDTO = new ArrayList<>();
        for (Cv c : cvsList) {
            cvsDTO.add(mapper.CvToCvDTO(c));
        }
        return cvsDTO;
    }
    
    public void deleteCV(Long cvID) {
        repository.deleteById(cvID);
    }
}
