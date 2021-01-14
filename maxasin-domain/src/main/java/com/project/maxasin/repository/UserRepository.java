package com.project.maxasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.maxasin.security.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findUserByUsername(String username);
}
