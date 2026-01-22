package com.example.CarRentalSystem.service.impl;

import com.example.CarRentalSystem.dto.CarDTO;
import com.example.CarRentalSystem.entity.CarEntity;
import com.example.CarRentalSystem.repository.CarRepository;
import com.example.CarRentalSystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceimpl implements CarService {
    @Autowired
    private CarRepository repo;

    public CarDTO createCar(CarDTO cardto){
        CarEntity car = new CarEntity(
                cardto.getCarId(),
                cardto.getBrand(),
                cardto.getModel(),
                cardto.getPricePerDay(),
                cardto.getAvailable()
        );
        CarEntity savedcar = repo.save(car);
        return new CarDTO(
                savedcar.getCarId(),
                savedcar.getBrand(),
                savedcar.getModel(),
                savedcar.getPricePerDay(),
                savedcar.getAvailable()
        );
    }
    public List<CarEntity> getAllCars(){
        List<CarEntity> getcars = repo.findAll();
        return getcars;
    }
    public List<CarEntity>getAvailableCars(){
        List<CarEntity> avail = repo.findByAvailableTrue();
        return avail;
    }

}
