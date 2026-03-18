package com.example.parkingmanagementsystem.service.impl;

import com.example.parkingmanagementsystem.dto.LoginDTO;
import com.example.parkingmanagementsystem.entity.RegisterEntity;
import com.example.parkingmanagementsystem.repository.RegisterRepository;
import com.example.parkingmanagementsystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceimpl implements LoginService {
    @Autowired
    private RegisterRepository repo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public String loginUser(LoginDTO logindto){
        // 1) check email exits
        Optional<RegisterEntity> userOptional = repo.findByEmail(logindto.getEmail());

        if(userOptional.isEmpty()){
            return "user not found";
        }
        RegisterEntity user = userOptional.get();

        //2) Check password using bcrypt
        if(!passwordEncoder.matches(logindto.getPassword(),user.getPassword())){
            return "Invalid password";
        }
        return "Login successfully";
    }

}
