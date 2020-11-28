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
public class TemplateCvSectionDTO {

    private Long id;
    private Integer sectionOrder;
    private Integer numberOfAppearances;
    private TemplateCvDTO idTemplate;
    private TemplateSectionDTO idSection;

    public TemplateCvSectionDTO() {
    }

    public TemplateCvSectionDTO(Long id, Integer sectionOrder, Integer numberOfAppearances, TemplateCvDTO idTemplate, TemplateSectionDTO idSection) {
        this.id = id;
        this.sectionOrder = sectionOrder;
        this.numberOfAppearances = numberOfAppearances;
        this.idTemplate = idTemplate;
        this.idSection = idSection;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSectionOrder(Integer sectionOrder) {
        this.sectionOrder = sectionOrder;
    }

    public Integer getSectionOrder() {
        return sectionOrder;
    }

    public Integer getNumberOfAppearances() {
        return numberOfAppearances;
    }

    public void setNumberOfAppearances(Integer numberOfAppearances) {
        this.numberOfAppearances = numberOfAppearances;
    }

    public TemplateCvDTO getIdTemplate() {
        return idTemplate;
    }

    public void setIdTemplate(TemplateCvDTO idTemplate) {
        this.idTemplate = idTemplate;
    }

    public TemplateSectionDTO getIdSection() {
        return idSection;
    }

    public void setIdSection(TemplateSectionDTO idSection) {
        this.idSection = idSection;
    }

    

}
