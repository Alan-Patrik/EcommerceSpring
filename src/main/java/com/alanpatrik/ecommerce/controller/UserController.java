package com.alanpatrik.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alanpatrik.ecommerce.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = new ArrayList<>();
		list.add(new User(1L, "Alan Patrik", "alanpatrik.fragozo@gmail.com", "2498867-1021", "123456"));
		return ResponseEntity.ok().body(list);
	}
	
//	@GetMapping("/{id}")
//	public ResponseEntity<User> findById(@PathVariable Long id) {
//		List<User> list = new ArrayList<>();
//		User user = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//		if (user == null) {
//			System.out.println("Id não encontrado!" + user);
//		}
//		
//		return ResponseEntity.ok().body(user);
//	}
	

}
