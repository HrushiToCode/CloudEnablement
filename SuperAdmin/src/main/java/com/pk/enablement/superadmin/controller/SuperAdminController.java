package com.pk.enablement.superadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pk.enablement.superadmin.entity.Users;
import com.pk.enablement.superadmin.model.UserDetails;
import com.pk.enablement.superadmin.repository.UserRepository;

@RestController
public class SuperAdminController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(path="/addUser", method=RequestMethod.POST, consumes="application/json")
	public String addUser(@RequestBody UserDetails userDetails) {
		Users user = new Users();
		user.setEmail(userDetails.getEmail());
		user.setName(userDetails.getName());
		user.setPassword(userDetails.getPassword());
		user.setUserType(userDetails.getUserType());
		
		userRepository.save(user);
		return "User successfully added";
	}
}
