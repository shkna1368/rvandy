package com.shabab.firsspringapp.db;

import com.shabab.firsspringapp.exception.ConflictException;
import com.shabab.firsspringapp.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {

   private final StudentRepository repository;


    @Override

    @Caching(evict = {
            @CacheEvict(value = "one", allEntries = true),
            @CacheEvict(value = "two", allEntries = true)

    })
    public Student addNew(Student student) {

        if (repository.existsByFullName(student.getFullName())){

            throw new ConflictException(student.getFullName() +" already Exist");
        }

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
    @Cacheable(value = "two",key = "#studentId")
    public Student getById(Long studentId) {
        Optional<Student> optionalStudent=repository.findById(studentId);

        if (optionalStudent.isPresent()){
            return optionalStudent.get();

        }
        else {



            throw new NotFoundException(studentId+" not found");
        }


    }


    @Override
    @Cacheable(value = "one")
    public List<Student> getAll() {

        return (List<Student>) repository.findAll();
    }

    @Override
    public void deletById(Long id) {

      getById(id)  ;

        repository.deleteById(id);
    }
}
