package com.example.user_service.controller;

import com.example.user_service.model.Credential;
import com.example.user_service.service.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private CredentialService credentialService;

    @PostMapping
    public ResponseEntity<Boolean> login(@RequestBody Credential credential) {
        return ResponseEntity.ok(credentialService.login(credential));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Credential credential) {

        return ResponseEntity.ok(credentialService.register(credential));
    }

}
