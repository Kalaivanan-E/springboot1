package com.example.JobPortApplication.service.impl;

import com.example.JobPortApplication.entity.Job;
import com.example.JobPortApplication.repository.JobRepository;
import com.example.JobPortApplication.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceimpl implements JobService {
    @Autowired
    private JobRepository repo;

    public Job postJob(Job job){
        return repo.save(job);
    }
    public List<Job>getAllJob(){
        return repo.findAll();
    }
    public Job GetJobById(Long id){
        return repo.findById(id).orElse(null);
    }
    public void DeleteJob(Long id){
        repo.deleteById(id);
    }

}
