package com.example.parkingmanagementsystem.service.impl;

import com.example.parkingmanagementsystem.dto.RegisterDTO;
import com.example.parkingmanagementsystem.entity.RegisterEntity;
import com.example.parkingmanagementsystem.repository.RegisterRepository;
import com.example.parkingmanagementsystem.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegisterServiceimpl implements RegisterService {

    @Autowired
    private RegisterRepository repo;

    public String registerUser(RegisterDTO requestdto){
        // 1) chech password match
        if(!requestdto.getPassword().equals(requestdto.getConfirmPassword())){
            return "Password and Confirm Password must match";
        }
        // 2) check email already exists
        Optional<RegisterEntity> existingUser = repo.findByEmail(requestdto.getEmail());
        if (existingUser.isPresent()) {
            return "Email already registered";
        }
        // convert DTO -> entity
        RegisterEntity user = new RegisterEntity();  //Creating object to store data in DB
        user.setUserName(requestdto.getUserName());
        user.setEmail(requestdto.getEmail());
        user.setPassword(requestdto.getPassword());
        user.setPhoneNumber(requestdto.getPhoneNumber());
        // save
        repo.save(user);
        return "User Register successfully";
    }
}
