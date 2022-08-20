package com.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Product;
import com.app.entities.User;
public interface IUserRepository extends JpaRepository<User,Long> {

}
