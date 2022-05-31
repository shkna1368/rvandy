package com.shabab.firsspringapp.db.medical_test;

import java.util.List;

public interface IMedicalTestService {

    MedicalTest addNew(MedicalTest medicalTest);
    List<MedicalTest> getAll();
    List<MedicalTest> getAllByStudentId(Long studentId);


}
