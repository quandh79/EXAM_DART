package com.example.api_dart.service;

import com.example.api_dart.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerEntity customer);
    List<CustomerEntity> getAllCustomer();
}
