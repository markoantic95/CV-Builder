/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.dao;

import com.cvbuilder.entities.TemplateCv;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Marko
 */
public interface TemplateCvRepository extends JpaRepository<TemplateCv, Long>{
    
    @Query("SELECT tc FROM TemplateCv tc WHERE tc.idUser.id = ?1")
    public List<TemplateCv> returnTemplatesForUser(Long userID);
}
