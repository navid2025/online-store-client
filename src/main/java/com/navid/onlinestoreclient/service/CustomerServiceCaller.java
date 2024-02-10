package com.navid.onlinestoreclient.service;

import com.navid.onlinestoreclient.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerServiceCaller {

    @Autowired
    RestTemplate restTemplate;
    public List<CustomerDto> getAllCustomers() {
         return Arrays.stream(restTemplate.getForObject("http://localhost:8080/customers", CustomerDto[].class)).toList();
    }
    public CustomerDto getCustomerById(Long id) {
        return restTemplate.getForObject("http://localhost:8080/customers/" + id, CustomerDto.class);
    }
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return restTemplate.postForObject("http://localhost:8080/customers", customerDto, CustomerDto.class);
    }
    public void updateCustomer(CustomerDto customerDto) {
        restTemplate.put("http://localhost:8080/customers/", customerDto);
    }

}
