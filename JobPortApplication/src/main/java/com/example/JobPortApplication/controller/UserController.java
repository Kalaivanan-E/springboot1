package com.example.JobPortApplication.controller;

import com.example.JobPortApplication.entity.User;
import com.example.JobPortApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    public ResponseEntity<User>registerUser(@RequestBody User user){
        User add = service.registerUser(user);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }
    @GetMapping("/getAllUsers")
    public List<User>getAllUser(){
        List<User>get =service.getAllUser();
        return get;
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
        return service.getById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable  Long id){
        service.deleteUser(id);
        return "Deleted";
    }
}
