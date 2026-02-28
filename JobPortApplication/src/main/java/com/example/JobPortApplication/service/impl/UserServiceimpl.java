package com.example.JobPortApplication.service.impl;

import com.example.JobPortApplication.entity.User;
import com.example.JobPortApplication.repository.UserRepository;
import com.example.JobPortApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserRepository repo;
    public User registerUser(User user){
        return repo.save(user);
    }
    public List<User>getAllUser(){
        return repo.findAll();
    }
    public User getById(Long id){
        return repo.findById(id).orElse(null);
    }
    public void deleteUser(Long id){
        repo.deleteById(id);
    }
}
