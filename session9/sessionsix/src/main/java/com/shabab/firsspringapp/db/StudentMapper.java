package com.shabab.firsspringapp.db;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {


    @Mappings({
            @Mapping(target = "birthDate", source = "birthDate",ignore = false,qualifiedByName = "StudentTimeStampToDate")})

   Student toEntity(StudentDTO studentDTO) ;

    @Mappings({
            @Mapping(target = "birthDate", source = "birthDate",ignore = false,qualifiedByName = "StudentDateToTimeStamp")})

    StudentDTO toDTO(Student student) ;

   List<StudentDTO> toDTOs(List<Student> students);


   @Named("StudentTimeStampToDate")
   default Date timeStampToDate(Long timeStamp){
       return  new Date(timeStamp);

   }

   @Named("StudentDateToTimeStamp")
   default Long timeStampToDate(Date date){
       return  date.getTime();

   }


}
