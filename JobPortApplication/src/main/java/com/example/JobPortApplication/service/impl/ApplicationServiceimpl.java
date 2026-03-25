package com.example.JobPortApplication.service.impl;

import com.example.JobPortApplication.entity.Application;
import com.example.JobPortApplication.entity.Job;
import com.example.JobPortApplication.entity.User;
import com.example.JobPortApplication.repository.ApplicationRepository;
import com.example.JobPortApplication.repository.JobRepository;
import com.example.JobPortApplication.repository.UserRepository;
import com.example.JobPortApplication.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ApplicationServiceimpl implements ApplicationService {
    @Autowired
    private UserRepository userrepo;
    @Autowired
    private JobRepository jobrepo;
    @Autowired
    private ApplicationRepository applicationrepo;

    public Application applyJob(Long userid, Long jobid){


        User user = userrepo.findById(userid).orElseThrow(()->new RuntimeException("User not found"));
        Job job = jobrepo.findById(jobid).orElseThrow(()->new RuntimeException("job not found"));
        Application application = new Application();
        application.setUser(user);
        application.setJob(job);
        application.setStatus("Applied");
        application.setAppliedDate(LocalDate.now());
        return applicationrepo.save(application);
    }

    @Override
    public List<Application> getAllApplication() {
        return applicationrepo.findAll();
    }
    public Application getApplicationById(Long id){
        Application get = applicationrepo.findById(id).orElseThrow(()->new RuntimeException("Appplicaiton not found"));
        return get;
    }
}
