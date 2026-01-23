package com.example.CarRentalSystem.repository;

import com.example.CarRentalSystem.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingEntity,Long> {

}
