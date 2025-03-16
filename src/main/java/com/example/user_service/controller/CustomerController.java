package com.example.user_service.controller;

import com.example.user_service.model.Customer;
import com.example.user_service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService userService;

    @PostMapping
    public ResponseEntity<?> register(@RequestBody Customer user) {
        userService.register(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }
}
