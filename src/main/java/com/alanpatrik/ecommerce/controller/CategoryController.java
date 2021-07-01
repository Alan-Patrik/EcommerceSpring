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

import com.alanpatrik.ecommerce.entities.Category;
import com.alanpatrik.ecommerce.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Category> findAll() {
		List<Category> list = service.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Category> findById(@PathVariable Long id) {
		Optional<Category> list = service.findById(id);
		return list;
	}
}
