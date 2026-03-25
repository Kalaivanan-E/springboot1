package com.example.JobPortApplication.service;

import com.example.JobPortApplication.entity.Application;

import java.util.List;

public interface ApplicationService {
    Application applyJob(Long userid, Long jobid );
    List<Application> getAllApplication();
    Application getApplicationById(Long id);
}
