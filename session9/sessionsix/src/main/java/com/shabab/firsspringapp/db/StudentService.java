package com.shabab.firsspringapp.db;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {

   private final StudentRepository repository;


    @Override
    public Student addNew(Student student) {
        return repository.save(student);
    }

    @Override
    public Student update(Student student) {

      Student lastSavedStudent=getById(student.getId())  ;

      lastSavedStudent.setBirthDate(student.getBirthDate());
      lastSavedStudent.setFullName(student.getFullName());
      lastSavedStudent.setAge(student.getAge());
        return repository.save(lastSavedStudent);
    }

    @Override
    public Student getById(Long id) {
        Optional<Student> optionalStudent=repository.findById(id);

        if (optionalStudent.isPresent()){
            return optionalStudent.get();

        }
        else {

            throw new RuntimeException();
        }


    }

    @Override
    public List<Student> getAll() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public void deletById(Long id) {

      getById(id)  ;

        repository.deleteById(id);
    }
}
