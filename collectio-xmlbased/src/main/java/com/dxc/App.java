package com.dxc;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.employee.model.Employee;
import com.dxc.employee.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context = new ClassPathXmlApplicationContext("collecitions.xml");
     EmployeeService service = context.getBean(EmployeeService.class);
     
     Iterator<Employee> iterator = service.getListOfEmployee().iterator();
     while(iterator.hasNext()) {
    	 Employee emp = iterator.next();
    	 System.out.println("The  name of the employee is "+emp.getEname());
    	 System.out.println("The salary of the employee is "+emp.getSalary());
     }
     }
     
    }

