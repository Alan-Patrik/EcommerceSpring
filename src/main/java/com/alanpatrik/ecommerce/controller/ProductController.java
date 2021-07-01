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

import com.alanpatrik.ecommerce.entities.Product;
import com.alanpatrik.ecommerce.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Product> findAll() {
		List<Product> list = service.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Product> findById(@PathVariable Long id) {
		Optional<Product> list = service.findById(id);
		return list;
	}
}
