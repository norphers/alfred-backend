package com.alfred.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.alfred.models.User;
import com.alfred.models.User.Role;
import com.alfred.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll(); 
	}
	
	public User newUser(@RequestBody User user) throws Exception {
		
		boolean userExist=false;
		
		List<User> users = userRepository.findAll();
		
		for(User one : users) {
			if(user.getUsername().equals(one.getUsername())) {
				userExist=true;
			}
		}
		
		if(userExist) {
			throw new Exception("This username already exists");
		} else {
			user.setRole(Role.USER);
			return userRepository.save(user);
		}
	}
	
}
