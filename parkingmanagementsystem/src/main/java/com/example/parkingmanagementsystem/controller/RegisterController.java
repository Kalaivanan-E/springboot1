package com.example.parkingmanagementsystem.controller;

import com.example.parkingmanagementsystem.dto.RegisterDTO;
import com.example.parkingmanagementsystem.service.RegisterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/register")
public class RegisterController {
    @Autowired
    private RegisterService service;

    @PostMapping("/registerUser")
    public String registerUser(@Valid @RequestBody RegisterDTO registerdto){
       return service.registerUser(registerdto);

    }
}
