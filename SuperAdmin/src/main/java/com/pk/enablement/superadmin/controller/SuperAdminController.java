package com.pk.enablement.superadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pk.enablement.superadmin.model.UserDetails;
import com.pk.enablement.superadmin.service.SuperAdminService;

@RestController
public class SuperAdminController {
	
	@Autowired
	private SuperAdminService service;

	@RequestMapping(path="/addUser", method=RequestMethod.POST, consumes="application/json")
	public String addUser(@RequestBody UserDetails userDetails) {
		System.out.println(userDetails.getLastName());
		System.out.println(userDetails.getRole());
		return service.addUser(userDetails);
	}
}
