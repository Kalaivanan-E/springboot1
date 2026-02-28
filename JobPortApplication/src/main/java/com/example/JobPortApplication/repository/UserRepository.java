package com.example.JobPortApplication.repository;

import com.example.JobPortApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
