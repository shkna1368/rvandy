package com.shabab.firsspringapp.db;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends PagingAndSortingRepository<Student,Long> {

 List<Student> findAllByFullNameContaining(String name);
 List<Student> findAllByAge(Integer age);
 List<Student> findAllByAgeAfter(Integer age);
 List<Student> findAllByBirthDateBetween(Date start,Date end);
 Page<Student> findAll(Pageable pageable);
 Page<Student> findAllByAge(Pageable pageable,Integer age);
 Page<Student> findAllByAgeAndFullName(Pageable pageable,Integer age,String fullName);


 boolean existsByFullName(String fullName);

 /*@Query(value = "select * from table",nativeQuery = true)
    List<Student> findAllByQuery();*/










}
