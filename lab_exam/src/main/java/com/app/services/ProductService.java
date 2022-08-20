package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IProductRepository;
import com.app.entities.Product;

@Service
@Transactional
public class ProductService {
	@Autowired
	IProductRepository productRepo;
public List<Product> getAllProducts(){
	return productRepo.findAll();
}
}
