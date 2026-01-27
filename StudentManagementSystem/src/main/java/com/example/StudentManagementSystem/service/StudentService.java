package com.example.StudentManagementSystem.service;

import com.example.StudentManagementSystem.dto.StudentDTO;
import com.example.StudentManagementSystem.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentDTO createStudent(StudentDTO studentdto);
    List<StudentEntity> getAllStudent();
    StudentEntity getStudent(Long id);
    StudentDTO updateStudent(StudentDTO studentdto,Long id);
    void deleteStudent(Long id);
}
