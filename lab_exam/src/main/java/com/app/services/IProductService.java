package com.app.services;

import java.util.List;

import com.app.entities.Product;

public interface IProductService {
	public List<Product> getAllProducts();
	Product addProduct(Product product);

}
