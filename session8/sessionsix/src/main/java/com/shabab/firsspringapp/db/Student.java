package com.shabab.firsspringapp.db;


import jdk.jfr.Timespan;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_students")

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


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }



  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", fullName='" + fullName + '\'' +
            ", age=" + age +
            ", birthDate=" + birthDate +
            '}';
  }
}
