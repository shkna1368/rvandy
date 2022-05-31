package com.shabab.firsspringapp.db.medical_test;


import com.shabab.firsspringapp.db.Student;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Audited
@Entity
@Table(name = "tbl_medical_test")
@Data
public class MedicalTest {

  @Id
  @Column(name = "m_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;


  @Column(name = "type",nullable = false)
  private String type;




  @Column(name = "birthdate")
  @Temporal(TemporalType.TIMESTAMP)
  private Date createDate;

  @ManyToOne (fetch = FetchType.LAZY)
  @JoinColumn(name = "student_id")
  private Student student;

}
