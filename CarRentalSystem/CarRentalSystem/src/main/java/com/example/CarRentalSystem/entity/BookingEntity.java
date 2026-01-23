package com.example.CarRentalSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long bookingId;
    private int days;
    private LocalDate startDate;
    private LocalDate endDate;

    private Double totalAmount;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private CarEntity car;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;
}
