package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.services.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	IProductService productService;

	@GetMapping("/list")
	public String showProductList(Model map) {
		map.addAttribute("product_list", productService.getAllProducts());
		return "/product/list";
	}
}
