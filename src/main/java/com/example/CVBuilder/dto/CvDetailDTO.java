/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.dto;

import com.example.CVBuilder.entities.Cv;
import com.example.CVBuilder.entities.TemplateParam;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Marko
 */
public class CvDetailDTO {
     private Long id;
    private String stringValue;
    private Integer intValue;
    private Boolean booleanValue;
    private Double doubleValue;
    private String textValue;
    private String jsonValue;
    private byte[] imageValue;
    private Date dateValue;
    private CvDTO cvId;
    private TemplateParamDTO templateParamId;

    public CvDetailDTO() {
    }

    public CvDetailDTO(Long id, String stringValue, Integer intValue, Boolean booleanValue, Double doubleValue, String textValue, String jsonValue, byte[] imageValue, Date dateValue, CvDTO cvId, TemplateParamDTO templateParamId) {
        this.id = id;
        this.stringValue = stringValue;
        this.intValue = intValue;
        this.booleanValue = booleanValue;
        this.doubleValue = doubleValue;
        this.textValue = textValue;
        this.jsonValue = jsonValue;
        this.imageValue = imageValue;
        this.dateValue = dateValue;
        this.cvId = cvId;
        this.templateParamId = templateParamId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public String getJsonValue() {
        return jsonValue;
    }

    public void setJsonValue(String jsonValue) {
        this.jsonValue = jsonValue;
    }

    public byte[] getImageValue() {
        return imageValue;
    }

    public void setImageValue(byte[] imageValue) {
        this.imageValue = imageValue;
    }

    public CvDTO getCvId() {
        return cvId;
    }

    public void setCvId(CvDTO cvId) {
        this.cvId = cvId;
    }

    public TemplateParamDTO getTemplateParamId() {
        return templateParamId;
    }

    public void setTemplateParamId(TemplateParamDTO templateParamId) {
        this.templateParamId = templateParamId;
    }

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }
    
    
    
}
