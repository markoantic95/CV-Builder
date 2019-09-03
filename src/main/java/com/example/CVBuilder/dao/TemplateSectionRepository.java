/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.dao;

import com.example.CVBuilder.entities.TemplateSection;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Marko
 */
public interface TemplateSectionRepository extends JpaRepository<TemplateSection, Long>{
    
}
