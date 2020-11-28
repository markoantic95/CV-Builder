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
@Table(name = "template_section_param")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TemplateSectionParam.findAll", query = "SELECT t FROM TemplateSectionParam t")
    , @NamedQuery(name = "TemplateSectionParam.findById", query = "SELECT t FROM TemplateSectionParam t WHERE t.id = :id")
    , @NamedQuery(name = "TemplateSectionParam.findByParamOrder", query = "SELECT t FROM TemplateSectionParam t WHERE t.paramOrder = :paramOrder")})
public class TemplateSectionParam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "param_order")
    private Integer paramOrder;
    @JoinColumn(name = "id_section", referencedColumnName = "id")
    @ManyToOne
    private TemplateSection idSection;
    @JoinColumn(name = "id_param", referencedColumnName = "id")
    @ManyToOne
    private TemplateParam idParam;

    public TemplateSectionParam() {
    }

    public TemplateSectionParam(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getParamOrder() {
        return paramOrder;
    }

    public void setParamOrder(Integer paramOrder) {
        this.paramOrder = paramOrder;
    }

    public TemplateSection getIdSection() {
        return idSection;
    }

    public void setIdSection(TemplateSection idSection) {
        this.idSection = idSection;
    }

    public TemplateParam getIdParam() {
        return idParam;
    }

    public void setIdParam(TemplateParam idParam) {
        this.idParam = idParam;
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
        if (!(object instanceof TemplateSectionParam)) {
            return false;
        }
        TemplateSectionParam other = (TemplateSectionParam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.CVBuilder.entities.TemplateSectionParam[ id=" + id + " ]";
    }
    
}
