package com.example.JobPortApplication.service;

import com.example.JobPortApplication.entity.Job;

import java.util.List;

public interface JobService {

    Job postJob(Job job);
    List<Job> getAllJob();
    Job GetJobById(Long id);
    void DeleteJob(Long id);
}
