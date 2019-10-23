package com.slug.secu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slug.secu.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);
}
