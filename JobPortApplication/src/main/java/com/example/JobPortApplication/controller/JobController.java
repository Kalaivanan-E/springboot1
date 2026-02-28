package com.example.JobPortApplication.controller;

import com.example.JobPortApplication.entity.Job;
import com.example.JobPortApplication.entity.User;
import com.example.JobPortApplication.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job")
public class JobController {
    @Autowired
    private JobService service;

    @PostMapping("/postJob")
    public ResponseEntity<Job> postJob(@RequestBody Job job){
        Job add = service.postJob(job);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }
    @GetMapping("/getAllJob")
    public List<Job> getAllJob(){
        return service.getAllJob();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Job> GetJobById(@PathVariable Long id){
        Job get = service.GetJobById(id);
        return new ResponseEntity<>(get,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String>DeleteJob(@PathVariable Long id){
        service.DeleteJob(id);
        return ResponseEntity.ok("deleted successfully");
    }
}
