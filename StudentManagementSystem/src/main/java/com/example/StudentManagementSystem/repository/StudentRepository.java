package com.example.StudentManagementSystem.repository;

import com.example.StudentManagementSystem.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
    StudentEntity findByid(Long id);
}
