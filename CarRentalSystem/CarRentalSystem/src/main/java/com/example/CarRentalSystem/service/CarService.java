package com.example.CarRentalSystem.service;

import com.example.CarRentalSystem.dto.CarDTO;
import com.example.CarRentalSystem.entity.CarEntity;

import java.util.List;

public interface CarService {
    CarDTO createCar(CarDTO cardto);
    List<CarEntity> getAllCars();
    List<CarEntity> getAvailableCars();
}
