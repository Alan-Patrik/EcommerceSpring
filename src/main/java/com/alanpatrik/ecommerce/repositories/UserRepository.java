package com.alanpatrik.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanpatrik.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User save(Optional<User> entity);
}
