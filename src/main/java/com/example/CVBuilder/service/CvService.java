/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.service;

import com.example.CVBuilder.dto.CvDTO;
import java.util.List;

/**
 *
 * @author Marko
 */
public interface CvService {
    
    public CvDTO createACV(CvDTO cvDTO);
    public List<CvDTO> returnCVsForUser(Long userID);
    public void deleteCV(Long cvID);
}
