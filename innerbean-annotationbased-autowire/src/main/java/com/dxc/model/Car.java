package com.dxc.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private String carName;
	private String color;
	@Autowired
	private Enginetype enginetype;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Enginetype getEnginetype() {
		return enginetype;
	}
	public void setEnginetype(Enginetype enginetype) {
		this.enginetype = enginetype;
	}
	

}
