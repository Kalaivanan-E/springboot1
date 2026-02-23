package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.entity.Patient;

import java.util.List;

public interface PatientService {
    Patient addPatient(Patient patient);
    public List<Patient> getAllPatient();
    Patient getPatientById(Long id);
    void deletePatient(Long id);
}
