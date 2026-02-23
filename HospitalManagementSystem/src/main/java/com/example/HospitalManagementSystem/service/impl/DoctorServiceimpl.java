package com.example.HospitalManagementSystem.service.impl;

import com.example.HospitalManagementSystem.entity.Doctor;
import com.example.HospitalManagementSystem.repository.DoctorRepository;
import com.example.HospitalManagementSystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorServiceimpl implements DoctorService {

    @Autowired
    private DoctorRepository repo;

    public Doctor addDoctor(Doctor doctor){
        return repo.save(doctor);
    }
    public List<Doctor> getAllDoctor(){
        return repo.findAll();
    }
    public Doctor getDoctorById(Long id){
        return repo.findById(id).orElse(null);
    }
    public Doctor updateDoctor(Long id, Doctor doctor){
        Doctor get = repo.findById(id).orElse(null);
        get.setName(doctor.getName());
        get.setSpecialization(doctor.getSpecialization());
        Doctor saved = repo.save(get);
        return new Doctor(
                saved.getId(),
                saved.getName(),
                saved.getSpecialization()
        );
    }

}
