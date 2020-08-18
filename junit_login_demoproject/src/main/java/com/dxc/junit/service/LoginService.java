package com.dxc.junit.service;

import com.dxc.junit.model.User;

public class LoginService {
	
	
	
	public  boolean validatelogin(User user) {
		
		if(user.getUsername().equals(user.getPassowrd()))
			return true;
		return false;
		
		
		
	}
	

}
