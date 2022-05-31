package com.shabab.firsspringapp.db.medical_test;

import com.shabab.firsspringapp.db.Student;
import com.shabab.firsspringapp.db.StudentDTO;
import com.shabab.firsspringapp.db.StudentMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring",uses= StudentMapper.class)
public interface MedicaTestMapper {


    @Mappings({
            @Mapping(target = "createDate", source = "createDate",ignore = false,qualifiedByName = "MedicalTestTimeStampToDate")})
    MedicalTest toEntity(MedicalTestDTO medicalTestDTO) ;

    @Mappings({
            @Mapping(target = "createDate", source = "createDate",ignore = false,qualifiedByName = "MedicalTestDateToTimeStamp")})

    MedicalTestDTO toDTO(MedicalTest medicalTest) ;

   List<MedicalTestDTO> toDTOs(List<MedicalTest> medicalTests);


   @Named("MedicalTestTimeStampToDate")
   default Date timeStampToDate(Long timeStamp){

      Date d= new Date(timeStamp);
       return d ;

   }

   @Named("MedicalTestDateToTimeStamp")
   default Long dateToTimeStamp(Date date){
       return  date.getTime();

   }


}
