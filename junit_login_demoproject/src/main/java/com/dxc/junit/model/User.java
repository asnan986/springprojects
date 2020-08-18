package com.dxc.junit.model;

public class User {
	
	private  String username;
	private String passowrd;
	public User(String username, String passowrd) {
		super();
		this.username = username;
		this.passowrd = passowrd;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	

}
