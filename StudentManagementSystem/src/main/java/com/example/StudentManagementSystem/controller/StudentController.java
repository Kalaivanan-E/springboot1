package com.example.StudentManagementSystem.controller;

import com.example.StudentManagementSystem.dto.StudentDTO;
import com.example.StudentManagementSystem.entity.StudentEntity;
import com.example.StudentManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/create")
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentdto){
        StudentDTO create = service.createStudent(studentdto);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }
    @GetMapping("getallstudent")
    public List<StudentEntity> getAllStudent(){
        List<StudentEntity> getall = service.getAllStudent();
        return getall;
    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> getStudent(@PathVariable Long id){
        StudentEntity get = service.getStudent(id);
        return new ResponseEntity<>(get,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<StudentDTO>updateStudent(@RequestBody StudentDTO studentdto,@PathVariable Long id){
        StudentDTO update = service.updateStudent(studentdto,id);
        return ResponseEntity.ok(update);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        service.deleteStudent(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
