package com.navid.onlinestoreclient.controller;

import com.navid.onlinestoreclient.model.CustomerDto;
import com.navid.onlinestoreclient.service.CustomerServiceCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/callcustomer")
public class CustomerClientController {

    @Autowired
    CustomerServiceCaller customerServiceCaller;

    @GetMapping
    public List<CustomerDto> getCustomer(){
        System.out.println("before calling");
        return customerServiceCaller.getAllCustomers();
    }
    @GetMapping
    public CustomerDto getCustomerById(@RequestParam("id") Long customerId){
        return customerServiceCaller.getCustomerById(customerId);
    }
    @PostMapping
    public void createCustomer(@RequestBody CustomerDto customer){
        customerServiceCaller.createCustomer(customer);
    }
    @PutMapping
    public void updateCustomer(@RequestBody CustomerDto customer){
        customerServiceCaller.updateCustomer(customer);
    }



}
