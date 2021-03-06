package org.dxc.rest;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.dxc.rest.model.Employee;
import org.dxc.rest.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestwebserviceJerseyApplication {
	@Autowired
	private EmployeeDAO employeeDao;
	@PostConstruct
	public void initDB() {
	employeeDao.saveAll(Stream.of(new
	Employee(1,"asnan","mech"),new Employee(2,"ajay","mech"),new
	Employee(3,"aravind","cse")).collect(Collectors.toList()));
	}

	
	
	public static void main(String[] args) {
		SpringApplication.run(RestwebserviceJerseyApplication.class, args);
	}

}
