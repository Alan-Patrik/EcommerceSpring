package com.alanpatrik.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alanpatrik.ecommerce.entities.Product;
import com.alanpatrik.ecommerce.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository categoryRepository;
	
	public List<Product> findAll() {
		return categoryRepository.findAll();
	}
	
	public Optional<Product> findById(Long id) {
		return categoryRepository.findById(id);
		
	}

}
