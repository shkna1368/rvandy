package com.shabab.firsspringapp.db.medical_test;

import com.shabab.firsspringapp.db.IStudentService;
import com.shabab.firsspringapp.db.Student;
import com.shabab.firsspringapp.db.StudentRepository;
import com.shabab.firsspringapp.exception.ConflictException;
import com.shabab.firsspringapp.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MedicalTestService implements IMedicalTestService {

   private final MedicalTestRepository repository;
   private final IStudentService  studentService;




    @Override
    public MedicalTest addNew(MedicalTest medicalTest) {

    Student student= studentService.getById(medicalTest.getStudent().getId());
    medicalTest.setStudent(student);





        return repository.save(medicalTest);
    }

    @Override
    public List<MedicalTest> getAll() {
        return repository.findAll();
    }


    public List<MedicalTest> getAllByStudentId(Long studentId) {

        return repository.findAllByStudent_Id(studentId);
    }


}
