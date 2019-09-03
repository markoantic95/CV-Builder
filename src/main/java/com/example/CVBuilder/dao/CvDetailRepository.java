/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.dao;

import com.example.CVBuilder.entities.Cv;
import com.example.CVBuilder.entities.CvDetail;
import com.example.CVBuilder.entities.TemplateCvSection;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Marko
 */
public interface CvDetailRepository extends JpaRepository<CvDetail, Long>{
    @Query("SELECT cd FROM CvDetail cd WHERE cd.cvId.id = ?1")
    public List<CvDetail> returnCVDetails(Long cvID);
}
