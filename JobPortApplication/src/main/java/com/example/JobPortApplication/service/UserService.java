package com.example.JobPortApplication.service;

import com.example.JobPortApplication.entity.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);
    List<User>getAllUser();
    User getById(Long id);
    void deleteUser(Long id);
}
