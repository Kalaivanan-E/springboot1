package com.example.RegisterPage.service.impl;

import com.example.RegisterPage.entity.User;
import com.example.RegisterPage.repository.UserRepository;
import com.example.RegisterPage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserRepository repo;

    public User saveUser(User user){
        User saveUs = new User(
                user.getId(),
                user.getUsername(),
                user.getPassword()
        );
        User saved = repo.save(saveUs);
        return new User(
                saved.getId(),
                saved.getUsername(),
                saved.getPassword()
        );
    }
}