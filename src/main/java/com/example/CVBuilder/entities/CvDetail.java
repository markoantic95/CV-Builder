/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marko
 */
@Entity
@Table(name = "cv_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CvDetail.findAll", query = "SELECT c FROM CvDetail c")
    , @NamedQuery(name = "CvDetail.findById", query = "SELECT c FROM CvDetail c WHERE c.id = :id")
    , @NamedQuery(name = "CvDetail.findByStringValue", query = "SELECT c FROM CvDetail c WHERE c.stringValue = :stringValue")
    , @NamedQuery(name = "CvDetail.findByIntValue", query = "SELECT c FROM CvDetail c WHERE c.intValue = :intValue")
    , @NamedQuery(name = "CvDetail.findByBooleanValue", query = "SELECT c FROM CvDetail c WHERE c.booleanValue = :booleanValue")
    , @NamedQuery(name = "CvDetail.findByDoubleValue", query = "SELECT c FROM CvDetail c WHERE c.doubleValue = :doubleValue")
    , @NamedQuery(name = "CvDetail.findByDateValue", query = "SELECT c FROM CvDetail c WHERE c.dateValue = :dateValue")})
public class CvDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "string_value")
    private String stringValue;
    @Column(name = "int_value")
    private Integer intValue;
    @Column(name = "boolean_value")
    private Boolean booleanValue;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "double_value")
    private Double doubleValue;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "text_value")
    private String textValue;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "json_value")
    private String jsonValue;
    @Lob
    @Column(name = "image_value")
    private byte[] imageValue;
//    @Basic(optional = false)
//    @NotNull
    @Column(name = "date_value")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateValue;@Basic(optional = false)
//    @NotNull
    @JoinColumn(name = "cv_id", referencedColumnName = "id")
    @ManyToOne
    private Cv cvId;
    @JoinColumn(name = "template_param_id", referencedColumnName = "id")
    @ManyToOne
    private TemplateParam templateParamId;

    public CvDetail() {
    }

    public CvDetail(Long id) {
        this.id = id;
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

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    public Cv getCvId() {
        return cvId;
    }

    public void setCvId(Cv cvId) {
        this.cvId = cvId;
    }

    public TemplateParam getTemplateParamId() {
        return templateParamId;
    }

    public void setTemplateParamId(TemplateParam templateParamId) {
        this.templateParamId = templateParamId;
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
        if (!(object instanceof CvDetail)) {
            return false;
        }
        CvDetail other = (CvDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.CVBuilder.entities.CvDetail[ id=" + id + " ]";
    }
    
}
