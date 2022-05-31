package com.shabab.firsspringapp.db.medical_test;

import com.shabab.firsspringapp.db.StudentMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-19T18:45:56+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class MedicaTestMapperImpl implements MedicaTestMapper {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public MedicalTest toEntity(MedicalTestDTO medicalTestDTO) {
        if ( medicalTestDTO == null ) {
            return null;
        }

        MedicalTest medicalTest = new MedicalTest();

        medicalTest.setCreateDate( timeStampToDate( medicalTestDTO.getCreateDate() ) );
        medicalTest.setId( medicalTestDTO.getId() );
        medicalTest.setType( medicalTestDTO.getType() );
        medicalTest.setStudent( studentMapper.toEntity( medicalTestDTO.getStudent() ) );

        return medicalTest;
    }

    @Override
    public MedicalTestDTO toDTO(MedicalTest medicalTest) {
        if ( medicalTest == null ) {
            return null;
        }

        MedicalTestDTO medicalTestDTO = new MedicalTestDTO();

        medicalTestDTO.setCreateDate( dateToTimeStamp( medicalTest.getCreateDate() ) );
        medicalTestDTO.setId( medicalTest.getId() );
        medicalTestDTO.setType( medicalTest.getType() );
        medicalTestDTO.setStudent( studentMapper.toDTO( medicalTest.getStudent() ) );

        return medicalTestDTO;
    }

    @Override
    public List<MedicalTestDTO> toDTOs(List<MedicalTest> medicalTests) {
        if ( medicalTests == null ) {
            return null;
        }

        List<MedicalTestDTO> list = new ArrayList<MedicalTestDTO>( medicalTests.size() );
        for ( MedicalTest medicalTest : medicalTests ) {
            list.add( toDTO( medicalTest ) );
        }

        return list;
    }
}
