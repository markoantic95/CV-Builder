/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.dao;

import com.example.CVBuilder.entities.TemplateParam;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Marko
 */
public interface TemplateParamRepository extends JpaRepository<TemplateParam, Long>{
    @Query("SELECT tp FROM TemplateParam tp INNER JOIN TemplateSectionParam tsp on tp.id = "
            + "tsp.idParam INNER JOIN TemplateSection ts on tsp.idSection = ts.id"
            + " WHERE ts.id = ?1 ORDER BY tsp.paramOrder")
    public List<TemplateParam> returnParamsForSectionID(Long sectionID);
    
}
