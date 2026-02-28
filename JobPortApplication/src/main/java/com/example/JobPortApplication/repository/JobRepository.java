package com.example.JobPortApplication.repository;

import com.example.JobPortApplication.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
