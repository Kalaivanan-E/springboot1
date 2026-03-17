package com.example.parkingmanagementsystem.repository;

import com.example.parkingmanagementsystem.entity.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegisterRepository extends JpaRepository<RegisterEntity, Long> {

    Optional<RegisterEntity> findByEmail(String email);
}
