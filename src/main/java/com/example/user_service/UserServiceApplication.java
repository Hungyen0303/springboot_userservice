package com.example.user_service;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure()
				.directory("./")
				.ignoreIfMissing()
				.load();

		// Đặt tất cả biến từ .env vào System properties
		dotenv.entries().forEach(entry ->
				System.setProperty(entry.getKey(), entry.getValue()));
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
