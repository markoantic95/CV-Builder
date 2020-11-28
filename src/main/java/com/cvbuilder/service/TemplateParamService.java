/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.service;

import com.cvbuilder.dto.TemplateParamDTO;

import java.util.List;

/**
 *
 * @author Marko
 */
public interface TemplateParamService {
    
    public List<TemplateParamDTO> findAll();
    public List<TemplateParamDTO> returnParamsForSectionID(Long sectionID);
    
}
