package com.example.CarRentalSystem.service.impl;

import com.example.CarRentalSystem.entity.User;
import com.example.CarRentalSystem.repository.UserRepository;
import com.example.CarRentalSystem.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(User user) {

        // Encrypt password before saving
        String encryptedPassword =
                passwordEncoder.encode(user.getPassword());

        user.setPassword(encryptedPassword);

        userRepository.save(user);
    }
}