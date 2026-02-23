package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.entity.Doctor;

import java.util.List;

public interface DoctorService {

    Doctor addDoctor(Doctor doctor);
    List<Doctor> getAllDoctor();
    Doctor getDoctorById(Long id);
    Doctor updateDoctor(Long id, Doctor doctor);
}
