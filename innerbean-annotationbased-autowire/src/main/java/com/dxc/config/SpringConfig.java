package com.dxc.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.dxc.model.Car;
import com.dxc.model.Enginetype;

@Configuration
public class SpringConfig {

	@Bean("car")
	public Car newCar() {
		Car car=new Car();
		car.setCarName("rolls royce");
		car.setColor("white");
		return car;
	}
	@Bean("enginetype")
	public Enginetype newEnginetype()
	{
		Enginetype enginetype= new Enginetype();
		enginetype.setFueltype("petrol");
		enginetype.setEnginecapacity(1200);
	    return enginetype;	
	}
}
