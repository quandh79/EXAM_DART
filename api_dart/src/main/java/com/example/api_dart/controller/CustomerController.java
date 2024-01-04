package com.example.api_dart.controller;

import com.example.api_dart.entity.CustomerEntity;
import com.example.api_dart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerEntity customer) {
        try {
            customerService.saveCustomer(customer);
            return "create success";
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    @GetMapping("/getAll")
    public List<CustomerEntity> getAll() {
        List<CustomerEntity> list = new ArrayList<>();
        try {
            list = customerService.getAllCustomer();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
}
