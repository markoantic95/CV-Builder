/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.dto;

/**
 *
 * @author Marko
 */
public class TemplateCvDTO {

    private Long id;
    private String name;
    private UserDTO idUser;
//    private Collection<TemplateCvSection> templateCvSectionCollection;

    public TemplateCvDTO() {
    }

    public TemplateCvDTO(Long id, String name, UserDTO idUser) {
        this.id = id;
        this.name = name;
        this.idUser = idUser;
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

    public UserDTO getIdUser() {
        return idUser;
    }

    public void setIdUser(UserDTO idUser) {
        this.idUser = idUser;
    }

}
