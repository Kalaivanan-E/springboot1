package com.example.CarRentalSystem.repository;

import com.example.CarRentalSystem.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
    CustomerEntity findBycustomerId(Long customerId);
}
