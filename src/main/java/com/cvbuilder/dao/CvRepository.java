/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.dao;

import com.cvbuilder.entities.Cv;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Marko
 */
public interface CvRepository extends JpaRepository<Cv, Long>{
    @Query("SELECT c FROM Cv c WHERE c.createdUserId.id = ?1")
    public List<Cv> returnCVsForUser(Long userID);
}
