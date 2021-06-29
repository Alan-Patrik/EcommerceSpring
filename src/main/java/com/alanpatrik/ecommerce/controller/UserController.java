package com.alanpatrik.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alanpatrik.ecommerce.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Alan Patrik", "alanpatrik.fragozo@gmail.com", "2498867-1021", "123456");
		return ResponseEntity.ok().body(u);
	}

}
