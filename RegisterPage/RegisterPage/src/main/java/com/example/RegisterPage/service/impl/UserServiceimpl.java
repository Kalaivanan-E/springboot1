package com.example.RegisterPage.service.impl;

import com.example.RegisterPage.entity.User;
import com.example.RegisterPage.repository.UserRepository;
import com.example.RegisterPage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserRepository repo;

    public User saveUser(User user){

        // 1) Check emails already exist
        Optional<User> userOptional = repo.findByEmail(user.getEmail());
        if(userOptional.isPresent()){
            throw new RuntimeException("Email already register");
        }

        User saveUs = new User(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPhoneNumber(),
                user.getPassword()
        );
        User saved = repo.save(saveUs);
        return new User(
                saved.getId(),
                saved.getEmail(),
                saved.getPhoneNumber(),
                saved.getUsername(),
                saved.getPassword()
        );
    }
}