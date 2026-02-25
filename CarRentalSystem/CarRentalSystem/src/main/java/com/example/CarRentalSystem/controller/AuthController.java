package com.example.CarRentalSystem.controller;

import com.example.CarRentalSystem.entity.User;
import com.example.CarRentalSystem.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {

        userService.registerUser(user);

        return "User registered successfully";
    }
}