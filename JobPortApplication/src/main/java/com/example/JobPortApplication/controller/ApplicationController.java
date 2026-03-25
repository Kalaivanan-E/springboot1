package com.example.JobPortApplication.controller;

import com.example.JobPortApplication.entity.Application;
import com.example.JobPortApplication.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/application")
public class ApplicationController {
    @Autowired
    private ApplicationService service;
    @PostMapping("/addjobs/{userid}/{jobid}")
    public ResponseEntity<Application> applyjob(@PathVariable Long userid, @PathVariable Long jobid){
        Application apply = service.applyJob(userid,jobid);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("getAllApplication")
    public List<Application> getAllApplication(){
        return service.getAllApplication();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Application> getApplicationById(@PathVariable Long id){
        Application get = service.getApplicationById(id);
        return ResponseEntity.ok(get);
    }
}
