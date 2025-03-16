package com.example.user_service.repository;

import com.example.user_service.model.Credential;
import com.example.user_service.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends JpaRepository<Credential, Long> {
    Credential findByUsername(String username);

}
