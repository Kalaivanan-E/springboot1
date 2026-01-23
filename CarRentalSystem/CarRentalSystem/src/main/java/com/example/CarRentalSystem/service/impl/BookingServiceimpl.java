package com.example.CarRentalSystem.service.impl;

import com.example.CarRentalSystem.dto.BookingDTO;
import com.example.CarRentalSystem.entity.BookingEntity;
import com.example.CarRentalSystem.entity.CarEntity;
import com.example.CarRentalSystem.entity.CustomerEntity;
import com.example.CarRentalSystem.repository.BookingRepository;
import com.example.CarRentalSystem.repository.CarRepository;
import com.example.CarRentalSystem.repository.CustomerRepository;
import com.example.CarRentalSystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class BookingServiceimpl implements BookingService {

    @Autowired
    private BookingRepository bookingrepo;

    @Autowired
    private CarRepository carrepo;

    @Autowired
    private CustomerRepository customerrepo;

    public BookingDTO rentCar(Long carId, Long customerId, LocalDate startDate, LocalDate endDate) {


        CarEntity car = carrepo.findBycarId(carId);
        if (!car.getAvailable()) {
            throw new RuntimeException("Car Not found");
        }

        CustomerEntity customer = customerrepo.findBycustomerId(customerId);
        int days = (int) ChronoUnit.DAYS.between(startDate, endDate);
        if (days <= 0) {
            throw new RuntimeException("Invalid booking dates");
        }
        double totalamount = days * car.getPricePerDay();
        car.setAvailable(false);
        carrepo.save(car);
        BookingEntity booking = new BookingEntity();
        booking.setCar(car);
        booking.setCustomer(customer);
        booking.setStartDate(startDate);
        booking.setEndDate(endDate);
        booking.setTotalAmount(totalamount);

        BookingEntity savedbooking = bookingrepo.save(booking);
        return new BookingDTO(
                savedbooking.getBookingId(),
                days,
                totalamount
        );
    }
    }
