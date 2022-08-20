package com.app.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.entities.User;
import com.app.services.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService userService;
	
	@GetMapping("/login")
	public String loginPage() {
		return "/user/login";
	}
	@PostMapping("/login")
	public String processSigninForm(@RequestParam String userName, @RequestParam String password, HttpSession session, Model map,
			RedirectAttributes flashMap) {
		Optional<User> user = userService.authenticateUser(userName, password);
		session.setAttribute("user_details", user);
		return "redirect:/product/list";
		
	}
}
