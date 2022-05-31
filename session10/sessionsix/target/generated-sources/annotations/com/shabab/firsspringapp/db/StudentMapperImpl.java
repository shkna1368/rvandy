package com.shabab.firsspringapp.db;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-19T18:45:56+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student toEntity(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        Student student = new Student();

        student.setBirthDate( timeStampToDate( studentDTO.getBirthDate() ) );
        student.setId( studentDTO.getId() );
        student.setFullName( studentDTO.getFullName() );
        student.setAge( studentDTO.getAge() );

        return student;
    }

    @Override
    public StudentDTO toDTO(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setBirthDate( dateToTimeStamp( student.getBirthDate() ) );
        studentDTO.setId( student.getId() );
        studentDTO.setFullName( student.getFullName() );
        studentDTO.setAge( student.getAge() );

        return studentDTO;
    }

    @Override
    public List<StudentDTO> toDTOs(List<Student> students) {
        if ( students == null ) {
            return null;
        }

        List<StudentDTO> list = new ArrayList<StudentDTO>( students.size() );
        for ( Student student : students ) {
            list.add( toDTO( student ) );
        }

        return list;
    }
}
