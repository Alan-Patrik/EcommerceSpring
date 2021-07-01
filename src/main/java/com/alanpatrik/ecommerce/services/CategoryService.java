package com.alanpatrik.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alanpatrik.ecommerce.entities.Category;
import com.alanpatrik.ecommerce.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	public Optional<Category> findById(Long id) {
		return categoryRepository.findById(id);
		
	}

}
