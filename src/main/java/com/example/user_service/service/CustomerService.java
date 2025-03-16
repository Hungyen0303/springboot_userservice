package com.example.user_service.service;

import com.example.user_service.model.Customer;
import com.example.user_service.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    @Autowired
    private CustomerRepository userRepository;

    public void register(Customer user) {
        Customer newCustomer = new Customer();
        newCustomer.setFirstName(user.getFirstName());
        newCustomer.setLastName(user.getLastName());
        userRepository.save(newCustomer);
    }

    public List<Customer> getAll() {
        return userRepository.findAll();
    }
}
