package com.example.LoginPage.controller;

import com.example.LoginPage.entity.User;
import com.example.LoginPage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")

public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/saveUser")
    public ResponseEntity<User> saveUser(@RequestBody  User user){
        User save = service.saveUser(user);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }
}
