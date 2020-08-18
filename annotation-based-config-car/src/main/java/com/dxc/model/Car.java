package com.dxc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	 String car_brand;
	 String car_model;
	 int car_cc;
	 int car_price;
	 
	public String getCar_brand() {
		return car_brand;
	}
	@Value("Hyundai")
	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}
	public String getCar_model() {
		return car_model;
	}
	@Value("i20")
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	public int getCar_cc() {
		return car_cc;
	}@Value("1200")
	public void setCar_cc(int car_cc) {
		this.car_cc = car_cc;
	}
	public int getCar_price() {
		return car_price;
	}@Value("800000")
	public void setCar_price(int car_price) {
		this.car_price = car_price;
	}
	 
	 

}
