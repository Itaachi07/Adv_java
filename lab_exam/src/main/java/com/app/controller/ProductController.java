package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entities.Product;
import com.app.entities.User;
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
	@GetMapping("/add")
	public String showProductForm(Product product, HttpSession session) {
		return "/product/addproduct";
	}

	@PostMapping("/add")
	public String processCountryForm(Product product, HttpSession session, Model map) {
		try {
			 User user=(User)session.getAttribute("user_details");
			 product.setUser(user);
			Product p = productService.addProduct(product);
			if (p != null) {
				map.addAttribute("mesg", "Country Insertion Successful");
			}
			return "redirect:/country/list";
		} catch (RuntimeException e) {
			System.out.println("err in " + getClass() + " err " + e);
			map.addAttribute("mesg", "Invalid Details, Pls retry !!");
			return "redirect:/product/list";
		}
	}
	@GetMapping("/delete/{id}")
	public String deleteproduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return "/product/delete";
	}	
	
	
}
