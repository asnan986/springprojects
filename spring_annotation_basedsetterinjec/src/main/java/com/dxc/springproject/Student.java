package com.dxc.springproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("student")
public class Student {
	

	  String sname;
	  String department;
	  String email;
	  int id;
	  @Value("true")
	  boolean bonus;
	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}
	@Value("123")
	public void setId(int id) {
		this.id = id;
	}
	@Value("asnu")
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Value("royal mech")
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSname() {
		return sname;
	}
	public String getDepartment() {
		return department;
	}
	public String getEmail() {
		return email;
	}
	public int getId() {
		return id;
	}
	public boolean isBonus() {
		return bonus;
	}
	@Value("asnan@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
