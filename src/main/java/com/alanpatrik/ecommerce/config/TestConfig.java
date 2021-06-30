package com.alanpatrik.ecommerce.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alanpatrik.ecommerce.entities.User;
import com.alanpatrik.ecommerce.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		User u3 = new User(null, "Lucas Maroto", "lucas@gmail.com", "966666666", "123456");
		User u4 = new User(null, "Bob Johnson", "johnson@gmail.com", "955555555", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
	}
}
