package com.example.StudentManagementSystem.service.impl;

import com.example.StudentManagementSystem.dto.StudentDTO;
import com.example.StudentManagementSystem.entity.StudentEntity;
import com.example.StudentManagementSystem.repository.StudentRepository;
import com.example.StudentManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    public StudentDTO createStudent(StudentDTO studentdto){
        StudentEntity student = new StudentEntity(
                studentdto.getId(),
                studentdto.getName(),
                studentdto.getAge(),
                studentdto.getEmail()
        );
        StudentEntity savedstudent = repo.save(student);
        return new StudentDTO(
                savedstudent.getId(),
                savedstudent.getName(),
                savedstudent.getAge(),
                savedstudent.getEmail()
        );
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        List<StudentEntity> listall = repo.findAll();
        return listall;
    }

    public StudentEntity getStudent(Long id){
        StudentEntity student = repo.findByid(id);
        return student;
    }
    public StudentDTO updateStudent(StudentDTO studentdto,Long id){
        StudentEntity stud = repo.findByid(id);
        stud.setName(studentdto.getName());
        stud.setAge(studentdto.getAge());
        stud.setEmail(studentdto.getEmail());
        StudentEntity savedstud = repo.save(stud);

        return new StudentDTO(
                savedstud.getId(),
                savedstud.getName(),
                savedstud.getAge(),
                savedstud.getEmail()
        );
    }
    public void deleteStudent(Long id){
        StudentEntity delete = repo.findByid(id);
        repo.delete(delete);
    }
}
