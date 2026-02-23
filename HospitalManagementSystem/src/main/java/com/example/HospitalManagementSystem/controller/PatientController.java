package com.example.HospitalManagementSystem.controller;

import com.example.HospitalManagementSystem.entity.Patient;
import com.example.HospitalManagementSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/patient")
public class PatientController {
    @Autowired
    private PatientService service;

    @PostMapping("/addPatient")
    public ResponseEntity<Patient>addPatient(@RequestBody Patient patient){
        Patient add = service.addPatient(patient);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }
    @GetMapping("/getAllPatient")
    public List<Patient> getAllPatient(){
        return service.getAllPatient();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Patient>getPatientById(@PathVariable Long id){
        Patient get = service.getPatientById(id);
        return new ResponseEntity<>(get,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Long id){
         service.deletePatient(id);
         return "Patient deleted successfully";
    }
}
