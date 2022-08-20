package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.User;

public interface IUserRepository  extends JpaRepository<User, Long>{
	Optional<User> findByuserNameAndPassword(String userName, String password);
}
