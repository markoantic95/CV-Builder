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
import java.util.Arrays;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-05T20:19:13+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
@Component
public class GenericMapperImpl implements GenericMapper {

    @Override
    public UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setUsername( user.getUsername() );
        userDTO.setPassword( user.getPassword() );

        return userDTO;
    }

    @Override
    public User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setUsername( userDTO.getUsername() );
        user.setPassword( userDTO.getPassword() );

        return user;
    }

    @Override
    public TemplateCvDTO templateCvToTemplateCvDTO(TemplateCv templateCv) {
        if ( templateCv == null ) {
            return null;
        }

        TemplateCvDTO templateCvDTO = new TemplateCvDTO();

        templateCvDTO.setId( templateCv.getId() );
        templateCvDTO.setName( templateCv.getName() );
        templateCvDTO.setIdUser( userToUserDTO( templateCv.getIdUser() ) );

        return templateCvDTO;
    }

    @Override
    public TemplateCv templateCvDTOToTemplateCv(TemplateCvDTO templateCvDTO) {
        if ( templateCvDTO == null ) {
            return null;
        }

        TemplateCv templateCv = new TemplateCv();

        templateCv.setId( templateCvDTO.getId() );
        templateCv.setName( templateCvDTO.getName() );
        templateCv.setIdUser( userDTOToUser( templateCvDTO.getIdUser() ) );

        return templateCv;
    }

    @Override
    public TemplateSectionDTO templateSectionToTemplateSectionDTO(TemplateSection templateSection) {
        if ( templateSection == null ) {
            return null;
        }

        TemplateSectionDTO templateSectionDTO = new TemplateSectionDTO();

        templateSectionDTO.setId( templateSection.getId() );
        templateSectionDTO.setName( templateSection.getName() );

        return templateSectionDTO;
    }

    @Override
    public TemplateSection templateSectionDTOToTemplateSection(TemplateSectionDTO templateSectionDTO) {
        if ( templateSectionDTO == null ) {
            return null;
        }

        TemplateSection templateSection = new TemplateSection();

        templateSection.setId( templateSectionDTO.getId() );
        templateSection.setName( templateSectionDTO.getName() );

        return templateSection;
    }

    @Override
    public TemplateCvSectionDTO templateCvSectionToTemplateCvSectionDTO(TemplateCvSection templateCvSection) {
        if ( templateCvSection == null ) {
            return null;
        }

        TemplateCvSectionDTO templateCvSectionDTO = new TemplateCvSectionDTO();

        templateCvSectionDTO.setId( templateCvSection.getId() );
        templateCvSectionDTO.setSectionOrder( templateCvSection.getSectionOrder() );
        templateCvSectionDTO.setNumberOfAppearances( templateCvSection.getNumberOfAppearances() );
        templateCvSectionDTO.setIdTemplate( templateCvToTemplateCvDTO( templateCvSection.getIdTemplate() ) );
        templateCvSectionDTO.setIdSection( templateSectionToTemplateSectionDTO( templateCvSection.getIdSection() ) );

        return templateCvSectionDTO;
    }

    @Override
    public TemplateCvSection templateCvSectionDTOToTemplateCvSection(TemplateCvSectionDTO templateCvSectionDTO) {
        if ( templateCvSectionDTO == null ) {
            return null;
        }

        TemplateCvSection templateCvSection = new TemplateCvSection();

        templateCvSection.setId( templateCvSectionDTO.getId() );
        templateCvSection.setSectionOrder( templateCvSectionDTO.getSectionOrder() );
        templateCvSection.setNumberOfAppearances( templateCvSectionDTO.getNumberOfAppearances() );
        templateCvSection.setIdTemplate( templateCvDTOToTemplateCv( templateCvSectionDTO.getIdTemplate() ) );
        templateCvSection.setIdSection( templateSectionDTOToTemplateSection( templateCvSectionDTO.getIdSection() ) );

        return templateCvSection;
    }

    @Override
    public TemplateParamDTO templateParamToTemplateParamDTO(TemplateParam templateParam) {
        if ( templateParam == null ) {
            return null;
        }

        TemplateParamDTO templateParamDTO = new TemplateParamDTO();

        templateParamDTO.setId( templateParam.getId() );
        templateParamDTO.setName( templateParam.getName() );
        templateParamDTO.setDescription( templateParam.getDescription() );
        templateParamDTO.setClassType( templateParam.getClassType() );

        return templateParamDTO;
    }

    @Override
    public TemplateParam templateParamDTOToTemplateParam(TemplateParamDTO templateParamDTO) {
        if ( templateParamDTO == null ) {
            return null;
        }

        TemplateParam templateParam = new TemplateParam();

        templateParam.setId( templateParamDTO.getId() );
        templateParam.setName( templateParamDTO.getName() );
        templateParam.setDescription( templateParamDTO.getDescription() );
        templateParam.setClassType( templateParamDTO.getClassType() );

        return templateParam;
    }

    @Override
    public TemplateSectionParamDTO templateSectionParamToTemplateSectionParamDTO(TemplateSectionParam templateSectionParam) {
        if ( templateSectionParam == null ) {
            return null;
        }

        TemplateSectionParamDTO templateSectionParamDTO = new TemplateSectionParamDTO();

        templateSectionParamDTO.setId( templateSectionParam.getId() );
        templateSectionParamDTO.setIdSection( templateSectionToTemplateSectionDTO( templateSectionParam.getIdSection() ) );
        templateSectionParamDTO.setIdParam( templateParamToTemplateParamDTO( templateSectionParam.getIdParam() ) );

        return templateSectionParamDTO;
    }

    @Override
    public TemplateSectionParam templateSectionParamDTOToTemplateSectionParam(TemplateSectionParamDTO templateSectionParamDTO) {
        if ( templateSectionParamDTO == null ) {
            return null;
        }

        TemplateSectionParam templateSectionParam = new TemplateSectionParam();

        templateSectionParam.setId( templateSectionParamDTO.getId() );
        templateSectionParam.setIdSection( templateSectionDTOToTemplateSection( templateSectionParamDTO.getIdSection() ) );
        templateSectionParam.setIdParam( templateParamDTOToTemplateParam( templateSectionParamDTO.getIdParam() ) );

        return templateSectionParam;
    }

    @Override
    public CvDTO CvToCvDTO(Cv cv) {
        if ( cv == null ) {
            return null;
        }

        CvDTO cvDTO = new CvDTO();

        cvDTO.setId( cv.getId() );
        cvDTO.setCreated( cv.getCreated() );
        cvDTO.setCreatedUserId( userToUserDTO( cv.getCreatedUserId() ) );
        cvDTO.setTemplateCvId( templateCvToTemplateCvDTO( cv.getTemplateCvId() ) );

        return cvDTO;
    }

    @Override
    public Cv CvDTOToCv(CvDTO cvDTO) {
        if ( cvDTO == null ) {
            return null;
        }

        Cv cv = new Cv();

        cv.setId( cvDTO.getId() );
        cv.setCreated( cvDTO.getCreated() );
        cv.setCreatedUserId( userDTOToUser( cvDTO.getCreatedUserId() ) );
        cv.setTemplateCvId( templateCvDTOToTemplateCv( cvDTO.getTemplateCvId() ) );

        return cv;
    }

    @Override
    public CvDetailDTO CvDetailToCvDetailDTO(CvDetail cvDetail) {
        if ( cvDetail == null ) {
            return null;
        }

        CvDetailDTO cvDetailDTO = new CvDetailDTO();

        cvDetailDTO.setId( cvDetail.getId() );
        cvDetailDTO.setStringValue( cvDetail.getStringValue() );
        cvDetailDTO.setIntValue( cvDetail.getIntValue() );
        cvDetailDTO.setBooleanValue( cvDetail.getBooleanValue() );
        cvDetailDTO.setDoubleValue( cvDetail.getDoubleValue() );
        cvDetailDTO.setTextValue( cvDetail.getTextValue() );
        cvDetailDTO.setJsonValue( cvDetail.getJsonValue() );
        byte[] imageValue = cvDetail.getImageValue();
        if ( imageValue != null ) {
            cvDetailDTO.setImageValue( Arrays.copyOf( imageValue, imageValue.length ) );
        }
        cvDetailDTO.setCvId( CvToCvDTO( cvDetail.getCvId() ) );
        cvDetailDTO.setTemplateParamId( templateParamToTemplateParamDTO( cvDetail.getTemplateParamId() ) );
        cvDetailDTO.setDateValue( cvDetail.getDateValue() );

        return cvDetailDTO;
    }

    @Override
    public CvDetail CvDetailDTOToCvDetail(CvDetailDTO cvDetailDTO) {
        if ( cvDetailDTO == null ) {
            return null;
        }

        CvDetail cvDetail = new CvDetail();

        cvDetail.setId( cvDetailDTO.getId() );
        cvDetail.setStringValue( cvDetailDTO.getStringValue() );
        cvDetail.setIntValue( cvDetailDTO.getIntValue() );
        cvDetail.setBooleanValue( cvDetailDTO.getBooleanValue() );
        cvDetail.setDoubleValue( cvDetailDTO.getDoubleValue() );
        cvDetail.setTextValue( cvDetailDTO.getTextValue() );
        cvDetail.setJsonValue( cvDetailDTO.getJsonValue() );
        byte[] imageValue = cvDetailDTO.getImageValue();
        if ( imageValue != null ) {
            cvDetail.setImageValue( Arrays.copyOf( imageValue, imageValue.length ) );
        }
        cvDetail.setDateValue( cvDetailDTO.getDateValue() );
        cvDetail.setCvId( CvDTOToCv( cvDetailDTO.getCvId() ) );
        cvDetail.setTemplateParamId( templateParamDTOToTemplateParam( cvDetailDTO.getTemplateParamId() ) );

        return cvDetail;
    }
}
