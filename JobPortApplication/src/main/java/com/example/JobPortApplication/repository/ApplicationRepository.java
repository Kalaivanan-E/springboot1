package com.example.JobPortApplication.repository;

import com.example.JobPortApplication.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application,Long> {
}
