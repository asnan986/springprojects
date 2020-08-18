package com.dxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.model.annotation.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("autowire_byType.xml");
       Car car = (Car)context.getBean("car");
       
       System.out.println("car name "+car.getCarName());
       System.out.println("car engine type "+ car.getEnginetype().getEnginecapacity());
       
        
    }

	
}
