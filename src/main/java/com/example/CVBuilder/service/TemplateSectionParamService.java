/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.service;

import com.example.CVBuilder.dto.TemplateSectionParamDTO;
import java.util.List;

/**
 *
 * @author Marko
 */
public interface TemplateSectionParamService {
    
    public List<TemplateSectionParamDTO> findAll();
}
