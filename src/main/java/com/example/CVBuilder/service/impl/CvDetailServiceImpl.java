/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.service.impl;

import com.example.CVBuilder.dao.CvDetailRepository;
import com.example.CVBuilder.dao.CvRepository;
import com.example.CVBuilder.dto.CvDetailDTO;
import com.example.CVBuilder.dto.TemplateCvSectionDTO;
import com.example.CVBuilder.entities.CvDetail;
import com.example.CVBuilder.entities.TemplateCvSection;
import com.example.CVBuilder.mapper.GenericMapper;
import com.example.CVBuilder.service.CvDetailService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marko
 */
@Service
public class CvDetailServiceImpl implements CvDetailService{

    @Autowired
    GenericMapper mapper;
    @Autowired
    private CvDetailRepository repository;
    
    public CvDetailDTO saveCVDetail(CvDetailDTO detailDTO) {
        CvDetail detail = mapper.CvDetailDTOToCvDetail(detailDTO);
        return mapper.CvDetailToCvDetailDTO(repository.save(detail));
    }
    
    public List<CvDetailDTO> returnCVDetails(Long cvID) {
        List<CvDetail> cvDetails = repository.returnCVDetails(cvID);
        List<CvDetailDTO> cvDetailsDTO = new ArrayList<>();
        for (CvDetail cd : cvDetails) {
            cvDetailsDTO.add(mapper.CvDetailToCvDetailDTO(cd));
        }
        return cvDetailsDTO;
    }
}
