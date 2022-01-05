package com.pk.enablement.userlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pk.enablement.userlogin.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@RequestMapping(value="/auth", method = RequestMethod.POST, produces = "application/json")
	public List<?> authenticate(final String userName, final String password){
		
		return loginService.authenticate(userName, password);
	}
}
