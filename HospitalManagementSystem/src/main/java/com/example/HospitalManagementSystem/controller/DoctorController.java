package com.example.HospitalManagementSystem.controller;

import com.example.HospitalManagementSystem.entity.Doctor;
import com.example.HospitalManagementSystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    @Autowired
    private DoctorService service;

    @PostMapping("/addDoctor")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor){
        Doctor add = service.addDoctor(doctor);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }
    @GetMapping("/getAllDoctor")
    public List<Doctor> getAllDoctor(){
        return service.getAllDoctor();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Doctor>getDoctorById(@PathVariable Long id){
        Doctor get = service.getDoctorById(id);
        return new ResponseEntity<>(get,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Doctor>updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor){
        Doctor update = service.updateDoctor(id,doctor);
        return ResponseEntity.ok(update);
    }

}
