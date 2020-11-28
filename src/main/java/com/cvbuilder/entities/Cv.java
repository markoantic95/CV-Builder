/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marko
 */
@Entity
@Table(name = "cv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cv.findAll", query = "SELECT c FROM Cv c")
    , @NamedQuery(name = "Cv.findById", query = "SELECT c FROM Cv c WHERE c.id = :id")
    , @NamedQuery(name = "Cv.findByCreated", query = "SELECT c FROM Cv c WHERE c.created = :created")})
public class Cv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @JoinColumn(name = "created_user_id", referencedColumnName = "id")
    @ManyToOne
    private User createdUserId;
    @JoinColumn(name = "template_cv_id", referencedColumnName = "id")
    @ManyToOne
    private TemplateCv templateCvId;
    @OneToMany(mappedBy = "cvId")
    @JsonBackReference(value="cvcvdetail")
    private Collection<CvDetail> cvDetailCollection;

    public Cv() {
    }

    public Cv(Long id) {
        this.id = id;
    }

    public Cv(Long id, Date created) {
        this.id = id;
        this.created = created;
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

    public User getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(User createdUserId) {
        this.createdUserId = createdUserId;
    }

    public TemplateCv getTemplateCvId() {
        return templateCvId;
    }

    public void setTemplateCvId(TemplateCv templateCvId) {
        this.templateCvId = templateCvId;
    }

    @XmlTransient
    public Collection<CvDetail> getCvDetailCollection() {
        return cvDetailCollection;
    }

    public void setCvDetailCollection(Collection<CvDetail> cvDetailCollection) {
        this.cvDetailCollection = cvDetailCollection;
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
        if (!(object instanceof Cv)) {
            return false;
        }
        Cv other = (Cv) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.CVBuilder.entities.Cv[ id=" + id + " ]";
    }
    
}
