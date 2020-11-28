/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.entities;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marko
 */
@Entity
@Table(name = "template_cv_section")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TemplateCvSection.findAll", query = "SELECT t FROM TemplateCvSection t")
    , @NamedQuery(name = "TemplateCvSection.findById", query = "SELECT t FROM TemplateCvSection t WHERE t.id = :id")
    , @NamedQuery(name = "TemplateCvSection.findBySectionOrder", query = "SELECT t FROM TemplateCvSection t WHERE t.sectionOrder = :sectionOrder")
    , @NamedQuery(name = "TemplateCvSection.findByNumberOfAppearances", query = "SELECT t FROM TemplateCvSection t WHERE t.numberOfAppearances = :numberOfAppearances")})
public class TemplateCvSection implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "section_order")
    private Integer sectionOrder;
    @Column(name = "number_of_appearances")
    private Integer numberOfAppearances;
    @JoinColumn(name = "id_template", referencedColumnName = "id")
    @ManyToOne
    private TemplateCv idTemplate;
    @JoinColumn(name = "id_section", referencedColumnName = "id")
    @ManyToOne
    private TemplateSection idSection;

    public TemplateCvSection() {
    }

    public TemplateCvSection(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSectionOrder() {
        return sectionOrder;
    }

    public void setSectionOrder(Integer sectionOrder) {
        this.sectionOrder = sectionOrder;
    }

    public Integer getNumberOfAppearances() {
        return numberOfAppearances;
    }

    public void setNumberOfAppearances(Integer numberOfAppearances) {
        this.numberOfAppearances = numberOfAppearances;
    }

    public TemplateCv getIdTemplate() {
        return idTemplate;
    }

    public void setIdTemplate(TemplateCv idTemplate) {
        this.idTemplate = idTemplate;
    }

    public TemplateSection getIdSection() {
        return idSection;
    }

    public void setIdSection(TemplateSection idSection) {
        this.idSection = idSection;
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
        if (!(object instanceof TemplateCvSection)) {
            return false;
        }
        TemplateCvSection other = (TemplateCvSection) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.CVBuilder.entities.TemplateCvSection[ id=" + id + " ]";
    }
    
}
