package com.example.CarRentalSystem.controller;

import com.example.CarRentalSystem.dto.CarDTO;
import com.example.CarRentalSystem.dto.CustomerDTO;
import com.example.CarRentalSystem.entity.CarEntity;
import com.example.CarRentalSystem.service.CarService;
import com.example.CarRentalSystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rental")
public class CarController {
    @Autowired
    private CarService service;
    @Autowired
    private CustomerService custservice;

    @PostMapping("/create")
    public ResponseEntity<CarDTO>createCar(@RequestBody CarDTO cardto){
        CarDTO create = service.createCar(cardto);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }
    @GetMapping("/getallcars")
    public List<CarEntity> getAllCars(){
        List<CarEntity> getcars = service.getAllCars();
        return getcars;
    }
    @GetMapping("/availablecars")
    public List<CarEntity>getAvailableCars(){
        List<CarEntity> avail = service.getAvailableCars();
        return avail;
    }
    @PostMapping("/addcustomer")
    public ResponseEntity<CustomerDTO>addCustomer(@RequestBody CustomerDTO customerdto){

        CustomerDTO add = custservice.addCustomer(customerdto);
        return new ResponseEntity<>(add,HttpStatus.CREATED);
    }
}
