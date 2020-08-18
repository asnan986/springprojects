package com.dxc.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.dxc.properties.model.Student;
@PropertySource("classpath:/confiog.properties")
@Configuration
public class SpringConfig {
	
@Bean(name="configProperties")
public static PropertySourcesPlaceholderConfigurer createProperty() {
	return new PropertySourcesPlaceholderConfigurer();
}
	
@Bean(name="user")
public Student newStudent() {
	
	return new Student();
}
	



}
