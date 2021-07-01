package com.alanpatrik.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanpatrik.ecommerce.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
