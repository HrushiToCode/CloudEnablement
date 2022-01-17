package com.pk.enablement.userlogin.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.enablement.userlogin.entity.Users;
import com.pk.enablement.userlogin.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	private UserRepository userRepository;
	
	public String authenticate(final String userName, final String password){
		Users user = userRepository.getUserDetails(userName);
		if(user != null && password.equals(user.getPassword())) {
			return user.getUserRole();
		}
		return null;
	}
}
