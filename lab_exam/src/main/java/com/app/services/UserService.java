package com.app.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IUserRepository;
import com.app.entities.User;
@Service
@Transactional
public class UserService implements IUserService{
	@Autowired
	private IUserRepository userRepo;

	@Override
	public Optional<User> authenticateUser(String userName, String password) {
		Optional<User> optional = userRepo.findByuserNameAndPassword(userName, password);
		return optional;

	}

}
