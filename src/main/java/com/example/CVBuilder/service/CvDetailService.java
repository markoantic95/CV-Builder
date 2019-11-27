/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.service;

import com.example.CVBuilder.dto.CvDetailDTO;
import java.util.List;

/**
 *
 * @author Marko
 */
public interface CvDetailService {
    
    public CvDetailDTO saveCVDetail(CvDetailDTO detailDTO);
    public List<CvDetailDTO> returnCVDetails(Long cvID);
    
}
