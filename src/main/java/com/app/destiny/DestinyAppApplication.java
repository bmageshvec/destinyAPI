package com.app.destiny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.app.destiny.service.impl.UserAuthService;

@SpringBootApplication
public class DestinyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DestinyAppApplication.class, args);
	}
	
	
}
