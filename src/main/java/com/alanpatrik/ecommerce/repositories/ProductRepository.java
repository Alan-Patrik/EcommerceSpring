package com.alanpatrik.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanpatrik.ecommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
