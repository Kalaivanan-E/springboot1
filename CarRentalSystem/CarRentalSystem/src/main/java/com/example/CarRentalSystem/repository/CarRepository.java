package com.example.CarRentalSystem.repository;

import com.example.CarRentalSystem.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<CarEntity,Long> {
    CarEntity findBycarId(Long carId);
    List<CarEntity> findByAvailableTrue();
}
