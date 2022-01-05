package com.pk.enablement.userlogin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.enablement.userlogin.dao.LoginDao;
import com.pk.enablement.userlogin.dao.ProjectDetailsDao;
import com.pk.enablement.userlogin.dao.UserDetailsDao;
import com.pk.enablement.userlogin.model.ProjectDetails;
import com.pk.enablement.userlogin.model.UserDetails;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Autowired
	private UserDetailsDao userDetailsDao;
	
	@Autowired
	private ProjectDetailsDao projectDetailsDao;
	
	public List<?> authenticate(final String userName, final String password){
		final String result = loginDao.authenticateUser(userName, password);
		if ("superuser".equalsIgnoreCase(result)) {
			return getUserDetails(userName);
		}else if("failed".equalsIgnoreCase(result)) {
			return new ArrayList<>();
		}else {
			return getProjectDetails(userName);
		}
	}
	
	private List<UserDetails> getUserDetails(final String userName){
		return userDetailsDao.getUserData(userName);
	}
	
	private List<ProjectDetails> getProjectDetails(final String userName){
		return projectDetailsDao.getProjectDetails(userName);
	}
}
