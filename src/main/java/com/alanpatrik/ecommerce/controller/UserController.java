package com.alanpatrik.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alanpatrik.ecommerce.entities.User;
import com.alanpatrik.ecommerce.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<User> findAll() {
		List<User> list = service.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public Optional<User> findById(@PathVariable Long id) {
		Optional<User> list = service.findById(id);
		return list;
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id) { 
		service.delete(id);
	}
}
