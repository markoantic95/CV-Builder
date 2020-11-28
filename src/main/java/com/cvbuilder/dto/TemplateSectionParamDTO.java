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
public class TemplateSectionParamDTO {
    private Long id;
    private Integer order;
    private TemplateSectionDTO idSection;
    private TemplateParamDTO idParam;

    public TemplateSectionParamDTO() {
    }

    public TemplateSectionParamDTO(Long id, Integer order, TemplateSectionDTO idSection, TemplateParamDTO idParam) {
        this.id = id;
        this.order = order;
        this.idSection = idSection;
        this.idParam = idParam;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public TemplateSectionDTO getIdSection() {
        return idSection;
    }

    public void setIdSection(TemplateSectionDTO idSection) {
        this.idSection = idSection;
    }

    public TemplateParamDTO getIdParam() {
        return idParam;
    }

    public void setIdParam(TemplateParamDTO idParam) {
        this.idParam = idParam;
    }

    
    
    
}
