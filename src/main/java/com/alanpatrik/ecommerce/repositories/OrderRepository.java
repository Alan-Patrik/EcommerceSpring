package com.alanpatrik.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanpatrik.ecommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
