package com.alanpatrik.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanpatrik.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
