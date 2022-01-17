package com.pk.enablement.superadmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.enablement.superadmin.entity.Users;
import com.pk.enablement.superadmin.model.UserDetails;
import com.pk.enablement.superadmin.repository.UserRepository;

@Service
public class SuperAdminService {
	
	@Autowired
	private UserRepository userRepository;

	public String addUser(final UserDetails userDetails) {
		Users user = new Users();
		user.setUserName(userDetails.getUserName());
		user.setPassword(userDetails.getPassword());
		user.setPasswordSalt(userDetails.getSalt());
		user.setFirstName(userDetails.getFirstName());
		user.setLastName(userDetails.getLastName());
		user.setUserRole(userDetails.getRole());
		user.setEmailAddress(userDetails.getEmail());
		
		userRepository.save(user);
		return "User successfully added";
	}
}
