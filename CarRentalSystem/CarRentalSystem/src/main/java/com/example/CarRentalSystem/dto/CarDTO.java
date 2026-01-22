package com.example.CarRentalSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private Long carId;
    private String brand;
    private String model;
    private Double pricePerDay;
    private Boolean available;
}
