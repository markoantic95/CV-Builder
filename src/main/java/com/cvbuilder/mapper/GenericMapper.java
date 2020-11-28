/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.mapper;

import com.cvbuilder.dto.TemplateCvDTO;
import com.cvbuilder.dto.TemplateParamDTO;
import com.cvbuilder.dto.TemplateSectionDTO;
import com.cvbuilder.dto.CvDTO;
import com.cvbuilder.dto.CvDetailDTO;
import com.cvbuilder.dto.TemplateCvSectionDTO;
import com.cvbuilder.dto.TemplateSectionParamDTO;
import com.cvbuilder.dto.UserDTO;
import com.cvbuilder.entities.Cv;
import com.cvbuilder.entities.CvDetail;
import com.cvbuilder.entities.TemplateCv;
import com.cvbuilder.entities.TemplateCvSection;
import com.cvbuilder.entities.TemplateParam;
import com.cvbuilder.entities.TemplateSection;
import com.cvbuilder.entities.TemplateSectionParam;
import com.cvbuilder.entities.User;
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
