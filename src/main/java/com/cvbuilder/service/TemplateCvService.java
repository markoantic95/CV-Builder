/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.service;

import com.cvbuilder.dto.TemplateCvDTO;

import java.util.List;

/**
 *
 * @author Marko
 */
public interface TemplateCvService {
    
    public TemplateCvDTO createATemplate(TemplateCvDTO templateCv);
    public TemplateCvDTO updateTemplate(TemplateCvDTO templateCv);
    public List<TemplateCvDTO> findAll();
    public void deleteTemplate(Long tempID);
    public List<TemplateCvDTO> returnTemplatesForUser(Long userID);
}
