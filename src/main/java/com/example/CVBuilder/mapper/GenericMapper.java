/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.mapper;

import com.example.CVBuilder.dto.CvDTO;
import com.example.CVBuilder.dto.CvDetailDTO;
import com.example.CVBuilder.dto.TemplateCvDTO;
import com.example.CVBuilder.dto.TemplateCvSectionDTO;
import com.example.CVBuilder.dto.TemplateParamDTO;
import com.example.CVBuilder.dto.TemplateSectionDTO;
import com.example.CVBuilder.dto.TemplateSectionParamDTO;
import com.example.CVBuilder.dto.UserDTO;
import com.example.CVBuilder.entities.Cv;
import com.example.CVBuilder.entities.CvDetail;
import com.example.CVBuilder.entities.TemplateCv;
import com.example.CVBuilder.entities.TemplateCvSection;
import com.example.CVBuilder.entities.TemplateParam;
import com.example.CVBuilder.entities.TemplateSection;
import com.example.CVBuilder.entities.TemplateSectionParam;
import com.example.CVBuilder.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenericMapper {

    UserDTO userToUserDTO(User user);
    User userDTOToUser(UserDTO userDTO);
    
    TemplateCvDTO templateCvToTemplateCvDTO(TemplateCv templateCv);
    TemplateCv templateCvDTOToTemplateCv(TemplateCvDTO templateCvDTO);
    
    TemplateSectionDTO templateSectionToTemplateSectionDTO(TemplateSection templateSection);
    TemplateSection templateSectionDTOToTemplateSection(TemplateSectionDTO templateSectionDTO);
    
    TemplateCvSectionDTO templateCvSectionToTemplateCvSectionDTO(TemplateCvSection templateCvSection);
    TemplateCvSection templateCvSectionDTOToTemplateCvSection(TemplateCvSectionDTO templateCvSectionDTO);

    TemplateParamDTO templateParamToTemplateParamDTO(TemplateParam templateParam);
    TemplateParam templateParamDTOToTemplateParam(TemplateParamDTO templateParamDTO);
    
    TemplateSectionParamDTO templateSectionParamToTemplateSectionParamDTO(TemplateSectionParam templateSectionParam);
    TemplateSectionParam templateSectionParamDTOToTemplateSectionParam(TemplateSectionParamDTO templateSectionParamDTO);

    CvDTO CvToCvDTO(Cv cv);
    Cv CvDTOToCv(CvDTO cvDTO);
    
    CvDetailDTO CvDetailToCvDetailDTO(CvDetail cvDetail);
    CvDetail CvDetailDTOToCvDetail(CvDetailDTO cvDetailDTO);
}
