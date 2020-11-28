/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.service.impl;

import com.cvbuilder.dao.CvRepository;
import com.cvbuilder.dto.CvDTO;
import com.cvbuilder.entities.Cv;
import com.cvbuilder.mapper.GenericMapper;
import com.cvbuilder.service.CvService;
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
