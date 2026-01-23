package com.example.CarRentalSystem.service;

import com.example.CarRentalSystem.dto.BookingDTO;

import java.time.LocalDate;

public interface BookingService {
    BookingDTO rentCar(Long carId, Long customerId, LocalDate startDate,LocalDate endDate);
}
