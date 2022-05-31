package com.shabab.firsspringapp.db;


import com.shabab.firsspringapp.db.medical_test.MedicalTest;
import jdk.jfr.Timespan;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Audited
@Entity
@Table(name = "tbl_students")
@Data
public class Student {

  @Id
  @Column(name = "student_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;


  @Column(name = "full_name",nullable = false)
  private String fullName;


  @Column(name = "age")
  private Integer age;


  @Column(name = "birthdate")
  @Temporal(TemporalType.TIMESTAMP)
  private Date birthDate;

/*
  @OneToMany
 private List<MedicalTest> medicalTestList;*/

}
