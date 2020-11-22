/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.dto;

import java.util.Date;

/**
 *
 * @author Marko
 */
public class CvDTO {
     private Long id;
    private Date created;
    private UserDTO createdUserId;
    private TemplateCvDTO templateCvId;
//    private Collection<CvDetail> cvDetailCollection;

    public CvDTO() {
    }

    public CvDTO(Long id, Date created, UserDTO createdUserId, TemplateCvDTO templateCvId) {
        this.id = id;
        this.created = created;
        this.createdUserId = createdUserId;
        this.templateCvId = templateCvId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public UserDTO getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(UserDTO createdUserId) {
        this.createdUserId = createdUserId;
    }

    public TemplateCvDTO getTemplateCvId() {
        return templateCvId;
    }

    public void setTemplateCvId(TemplateCvDTO templateCvId) {
        this.templateCvId = templateCvId;
    }
    
    
}
