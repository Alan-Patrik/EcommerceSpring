package com.alanpatrik.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alanpatrik.ecommerce.entities.User;
import com.alanpatrik.ecommerce.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}
	
	public User delete(Long id) {
		User user = repository.findById(id).get();
		repository.delete(user);
		return user;
	}
}
