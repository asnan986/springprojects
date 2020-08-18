package org.dxc.rest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.dxc.rest.model.Employee;
import org.dxc.rest.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/employeeResource")
public class EmployeeResource {
	
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/save")
	public Employee saveEmployee(Employee employee) {
		return employeeDAO.save(employee);
	}
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/getallemployee")
	public List<Employee> getAllEmployee(){
		
		return employeeDAO.findAll();
	}
	

}
