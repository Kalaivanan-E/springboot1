package com.example.CarRentalSystem.controller;

import com.example.CarRentalSystem.dto.BookingDTO;
import com.example.CarRentalSystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService service;

    @PostMapping("/rent")

    public BookingDTO rentCar(@RequestParam Long carId,
                              @RequestParam Long customerId,
                              @RequestParam LocalDate startDate,
                              @RequestParam LocalDate endDate){
        return service.rentCar(carId,customerId,startDate,endDate);
    }
}
