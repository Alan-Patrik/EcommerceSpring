package com.alanpatrik.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alanpatrik.ecommerce.entities.Order;
import com.alanpatrik.ecommerce.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Order> findAll() {
		List<Order> list = service.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public Optional<Order> findById(@PathVariable Long id) {
		Optional<Order> list = service.findById(id);
		return list;
	}
}
