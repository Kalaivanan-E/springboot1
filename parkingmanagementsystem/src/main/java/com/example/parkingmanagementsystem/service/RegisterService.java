package com.example.parkingmanagementsystem.service;

import com.example.parkingmanagementsystem.dto.RegisterDTO;
import com.example.parkingmanagementsystem.entity.RegisterEntity;

import java.util.List;

public interface RegisterService {
    String registerUser(RegisterDTO requestdto);
    List<RegisterEntity>getAllUser();
}
