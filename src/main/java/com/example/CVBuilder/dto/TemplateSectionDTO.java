/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.dto;

import com.example.CVBuilder.entities.TemplateCvSection;
import com.example.CVBuilder.entities.TemplateSectionParam;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

/**
 *
 * @author Marko
 */
public class TemplateSectionDTO {
    private Long id;
    private String name;
//    private Collection<TemplateSectionParam> templateSectionParamCollection;
//    private Collection<TemplateCvSection> templateCvSectionCollection;

    public TemplateSectionDTO() {
    }

    public TemplateSectionDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
