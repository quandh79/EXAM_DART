package com.example.api_dart.service.impl;

import com.example.api_dart.entity.CustomerEntity;
import com.example.api_dart.repository.CustomerRepository;
import com.example.api_dart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void saveCustomer(CustomerEntity customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<CustomerEntity> getAllCustomer() {
        return customerRepository.findAll();
    }
}
