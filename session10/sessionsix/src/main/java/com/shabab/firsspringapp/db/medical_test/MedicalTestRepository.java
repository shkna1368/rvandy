package com.shabab.firsspringapp.db.medical_test;

import com.shabab.firsspringapp.db.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface MedicalTestRepository extends PagingAndSortingRepository<MedicalTest,Long> {

 @EntityGraph("student")
 Page<MedicalTest> findAll(Pageable pageable);


 @EntityGraph(attributePaths = {"student"})
 List<MedicalTest> findAll();



 @EntityGraph(attributePaths ={"student"})
 Optional<MedicalTest> findById(Long id);

 @EntityGraph(attributePaths = {"student"})
 List<MedicalTest> findAllByStudent(Student student);


 @EntityGraph(attributePaths = {"student"})
 List<MedicalTest> findAllByStudent_Id(Long student);

 @EntityGraph(attributePaths = {"student"})
 List<MedicalTest> findAllByStudent_fullName(String fullName);













}
