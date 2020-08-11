package com.alfred.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfred.models.User;
import com.alfred.repositories.UserRepository;
import com.alfred.services.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userService;
	
	//
	
	@RequestMapping("/welcome")
	public String WelcomePage() {
		return "Welcome to Alfred APP!";
	}
	
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}
	
	@PostMapping("/users")
	public User newUser(@RequestBody User user) throws Exception {
		return userService.newUser(user);
	}
}
