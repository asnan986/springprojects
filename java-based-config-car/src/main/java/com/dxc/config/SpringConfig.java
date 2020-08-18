package com.dxc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dxc.model.Car;

@Configuration
public class SpringConfig {
	
	
	@Bean
	public Car newCar() {
		
		return new Car();
		
		
		
	}
	

}
