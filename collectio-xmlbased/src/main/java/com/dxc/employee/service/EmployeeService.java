package com.dxc.employee.service;

import java.util.List;

import com.dxc.employee.model.Employee;

public class EmployeeService {
	
	private List<Employee> listOfEmployee;

	public List<Employee> getListOfEmployee() {
		return listOfEmployee;
	}

	public void setListOfEmployee(List<Employee> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}

}
