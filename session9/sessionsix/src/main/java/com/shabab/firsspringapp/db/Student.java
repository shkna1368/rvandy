package com.shabab.firsspringapp.db;


import jdk.jfr.Timespan;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;
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

}
