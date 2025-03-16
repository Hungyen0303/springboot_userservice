package com.example.user_service.service;

import com.example.user_service.model.Credential;
import com.example.user_service.model.Customer;
import com.example.user_service.repository.CredentialRepository;
import com.example.user_service.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CredentialService {

    @Autowired
    private CredentialRepository credentialRepository;

    public boolean login(Credential credential) {
        return credentialRepository.findByUsername(credential.getUsername()) != null;
    };

    public boolean register(Credential credential) {
        credentialRepository.save(credential);
        return true;
    }

    ;

}
