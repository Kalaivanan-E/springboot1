package com.example.CarRentalSystem.service.impl;

import com.example.CarRentalSystem.dto.CustomerDTO;
import com.example.CarRentalSystem.entity.CustomerEntity;
import com.example.CarRentalSystem.repository.CarRepository;
import com.example.CarRentalSystem.repository.CustomerRepository;
import com.example.CarRentalSystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceimpl implements CustomerService {
    @Autowired
    private CustomerRepository repo;

    public CustomerDTO addCustomer(CustomerDTO customerdto){
        CustomerEntity cus1 = new CustomerEntity(
                customerdto.getCustomerId(),
                customerdto.getName(),
                customerdto.getEmail(),
                customerdto.getPhone()
        );
        CustomerEntity savedcus1 = repo.save(cus1);
        return new CustomerDTO(
                savedcus1.getCustomerId(),
                savedcus1.getName(),
                savedcus1.getEmail(),
                savedcus1.getPhone()
        );
    }


}
