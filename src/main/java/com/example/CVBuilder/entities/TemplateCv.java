/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marko
 */
@Entity
@Table(name = "template_cv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TemplateCv.findAll", query = "SELECT t FROM TemplateCv t")
    , @NamedQuery(name = "TemplateCv.findById", query = "SELECT t FROM TemplateCv t WHERE t.id = :id")
    , @NamedQuery(name = "TemplateCv.findByName", query = "SELECT t FROM TemplateCv t WHERE t.name = :name")})
public class TemplateCv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne
    private User idUser;
    @OneToMany(mappedBy = "templateCvId")
    @JsonBackReference(value="tempcvcv")
    private Collection<Cv> cvCollection;
    @OneToMany(mappedBy = "idTemplate")
    @JsonBackReference(value="tempcvcvsec")
    private Collection<TemplateCvSection> templateCvSectionCollection;

    public TemplateCv() {
    }

    public TemplateCv(Long id) {
        this.id = id;
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

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @XmlTransient
    public Collection<Cv> getCvCollection() {
        return cvCollection;
    }

    public void setCvCollection(Collection<Cv> cvCollection) {
        this.cvCollection = cvCollection;
    }

    @XmlTransient
    public Collection<TemplateCvSection> getTemplateCvSectionCollection() {
        return templateCvSectionCollection;
    }

    public void setTemplateCvSectionCollection(Collection<TemplateCvSection> templateCvSectionCollection) {
        this.templateCvSectionCollection = templateCvSectionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemplateCv)) {
            return false;
        }
        TemplateCv other = (TemplateCv) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.CVBuilder.entities.TemplateCv[ id=" + id + " ]";
    }
    
}
