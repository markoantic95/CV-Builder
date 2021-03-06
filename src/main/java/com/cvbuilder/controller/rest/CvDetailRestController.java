/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.controller.rest;

import com.cvbuilder.dto.CvDetailDTO;
import com.cvbuilder.service.CvDetailService;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marko
 */
@RestController
public class CvDetailRestController {

    @Autowired
    CvDetailService service;
    
    @RequestMapping(value = "/saveCVDetail", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public @ResponseBody
    Object saveCVDetails(@RequestBody List<CvDetailDTO> detailList) {
        boolean success = true;
        List<CvDetailDTO> cvDetailList = new LinkedList<>();
        for (CvDetailDTO cvDetailDTO : detailList) {
            try {
                cvDetailList.add(service.saveCVDetail(cvDetailDTO));
            } catch (Exception ex) {
                success = false;
            }
        }
        if (success == true) {
            return ResponseEntity.status(HttpStatus.OK).body(cvDetailList);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Greska.");

    }

    
    @GetMapping("/returnCvDetails")
    public @ResponseBody
    Object returnCVDetails(@RequestParam Long cvID) {
        List<CvDetailDTO> cvDetailsList = service.returnCVDetails(cvID);
        return ResponseEntity.status(HttpStatus.OK).body(cvDetailsList);

    }
}
