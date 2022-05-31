package com.shabab.firsspringapp.db;

import java.util.List;

public interface IStudentService {
    Student addNew(Student student);
    Student update(Student student);
    Student getById(Long id);
    List<Student> getAll();
    void deletById(Long id);


}
