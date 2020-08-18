package com.dxc.demo;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	
	@Bean("hostel")
	public Hostel newHostel() {
		
		return new Hostel();
	}

}
