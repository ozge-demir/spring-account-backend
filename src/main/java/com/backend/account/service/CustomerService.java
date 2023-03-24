package com.backend.account.service;

import com.backend.account.exception.CustomerNotFoundException;
import com.backend.account.model.Customer;
import com.backend.account.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id) {
        return customerRepository.findById(id).orElseThrow(
                () -> new CustomerNotFoundException("Customer could not found by id: " + id ));
    }
}
