/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.dto;

/**
 *
 * @author Marko
 */
public class TemplateParamDTO {
    private Long id;
    private String name;
    private String description;
    private String classType;
//    private Collection<TemplateSectionParam> templateSectionParamCollection;

    public TemplateParamDTO() {
    }

    public TemplateParamDTO(Long id, String name, String description, String classType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.classType = classType;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }
    
    
}
