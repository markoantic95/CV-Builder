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
@Table(name = "template_param")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TemplateParam.findAll", query = "SELECT t FROM TemplateParam t")
    , @NamedQuery(name = "TemplateParam.findById", query = "SELECT t FROM TemplateParam t WHERE t.id = :id")
    , @NamedQuery(name = "TemplateParam.findByName", query = "SELECT t FROM TemplateParam t WHERE t.name = :name")
    , @NamedQuery(name = "TemplateParam.findByDescription", query = "SELECT t FROM TemplateParam t WHERE t.description = :description")
    , @NamedQuery(name = "TemplateParam.findByClassType", query = "SELECT t FROM TemplateParam t WHERE t.classType = :classType")})
public class TemplateParam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @Size(max = 255)
    @Column(name = "class_type")
    private String classType;
    @OneToMany(mappedBy = "templateParamId")
    @JsonBackReference(value="tempparcvdetail")
    private Collection<CvDetail> cvDetailCollection;
    @OneToMany(mappedBy = "idParam")
    @JsonBackReference(value="temppartempsecpar")
    private Collection<TemplateSectionParam> templateSectionParamCollection;

    public TemplateParam() {
    }

    public TemplateParam(Long id) {
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

    @XmlTransient
    public Collection<CvDetail> getCvDetailCollection() {
        return cvDetailCollection;
    }

    public void setCvDetailCollection(Collection<CvDetail> cvDetailCollection) {
        this.cvDetailCollection = cvDetailCollection;
    }

    @XmlTransient
    public Collection<TemplateSectionParam> getTemplateSectionParamCollection() {
        return templateSectionParamCollection;
    }

    public void setTemplateSectionParamCollection(Collection<TemplateSectionParam> templateSectionParamCollection) {
        this.templateSectionParamCollection = templateSectionParamCollection;
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
        if (!(object instanceof TemplateParam)) {
            return false;
        }
        TemplateParam other = (TemplateParam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.CVBuilder.entities.TemplateParam[ id=" + id + " ]";
    }
    
}
