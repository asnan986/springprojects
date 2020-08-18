package com.dxc.properties.model;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${username}")
	private String username;
	@Value("${password}")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
