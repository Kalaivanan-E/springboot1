package com.example.parkingmanagementsystem.controller;

import com.example.parkingmanagementsystem.dto.RegisterDTO;
import com.example.parkingmanagementsystem.entity.RegisterEntity;
import com.example.parkingmanagementsystem.service.RegisterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/register")
public class RegisterController {
    @Autowired
    private RegisterService service;

    @PostMapping("/registerUser")
    public String registerUser(@Valid @RequestBody RegisterDTO registerdto){
       return service.registerUser(registerdto);
    }

    @GetMapping("/getAllUser")
    public List<RegisterEntity>getAllUser(){
        return service.getAllUser();
    }
}
