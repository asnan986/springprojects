package com.dxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dxc.config.SpringConfig;
import com.dxc.service.CustomerService;
import com.dxc.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class); 
        
        EmployeeService service= ac.getBean(EmployeeService.class);
        CustomerService service2 = ac.getBean(CustomerService.class);
        
        
        service.registerEmployee();
        
        service2.registerCustomer();
        
        
    }
}
