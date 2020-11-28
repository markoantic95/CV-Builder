/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.service;

import com.cvbuilder.dto.TemplateCvSectionDTO;

import java.util.List;

/**
 *
 * @author Marko
 */
public interface TemplateCvSectionService {
    
    public List<TemplateCvSectionDTO> findAll();
    public TemplateCvSectionDTO saveTemplateWithSections(TemplateCvSectionDTO templateCvSectionDTO);
    public TemplateCvSectionDTO updateTemplateWithSections(TemplateCvSectionDTO templateCvSectionDTO);
    public List<TemplateCvSectionDTO> returnTemplateWithSections(Long tempID);
    public void deleteSectionFromTemplate(Long tempSectionID);
}
