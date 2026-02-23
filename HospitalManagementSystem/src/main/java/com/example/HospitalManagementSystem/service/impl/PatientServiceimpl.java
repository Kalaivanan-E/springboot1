package com.example.HospitalManagementSystem.service.impl;

import com.example.HospitalManagementSystem.entity.Patient;
import com.example.HospitalManagementSystem.repository.PatientRepository;
import com.example.HospitalManagementSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceimpl implements PatientService {

    @Autowired
    private PatientRepository repository;

    public Patient addPatient(Patient patient){
        return repository.save(patient);
    }
    public List<Patient> getAllPatient(){
        return repository.findAll();
    }
    public Patient getPatientById(Long id){
        return repository.findById(id).orElse(null);
    }
    public void deletePatient(Long id){
      repository.deleteById(id);
    }
}
