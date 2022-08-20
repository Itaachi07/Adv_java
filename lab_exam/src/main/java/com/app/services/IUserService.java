package com.app.services;

import java.util.Optional;



import com.app.entities.User;

public interface IUserService {
	Optional<User> authenticateUser(String userName, String password);

}
