/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.dao;

import com.example.CVBuilder.entities.TemplateSectionParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Marko
 */
public interface TemplateSectionParamRepository extends JpaRepository<TemplateSectionParam ,Long>{

}
