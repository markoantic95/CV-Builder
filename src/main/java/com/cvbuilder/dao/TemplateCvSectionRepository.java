/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.dao;

import com.cvbuilder.entities.TemplateCvSection;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Marko
 */
public interface TemplateCvSectionRepository extends JpaRepository<TemplateCvSection, Long> {

    @Query("SELECT ts FROM TemplateCvSection ts WHERE ts.idTemplate.id = ?1 ORDER BY ts.sectionOrder")
    public List<TemplateCvSection> returnTemplateWithSections(Long tempID);

}
