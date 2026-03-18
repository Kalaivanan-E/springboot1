package com.example.parkingmanagementsystem.controller;

import com.example.parkingmanagementsystem.dto.LoginDTO;
import com.example.parkingmanagementsystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private LoginService service;

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginDTO logindto){
        return ResponseEntity.ok(service.loginUser(logindto));
    }
}
