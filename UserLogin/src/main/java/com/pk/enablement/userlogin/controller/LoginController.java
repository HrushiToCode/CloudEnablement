package com.pk.enablement.userlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pk.enablement.userlogin.model.Login;
import com.pk.enablement.userlogin.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@RequestMapping(value="/auth", method = RequestMethod.POST, consumes = "application/json")
	public String authenticate(@RequestBody Login login){
		return loginService.authenticate(login.getUserName(), login.getPassword());
	}
}
