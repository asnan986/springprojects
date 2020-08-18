package com.dxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.model.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Springcore-ioc.xml");
    	Car car = context.getBean(Car.class);
        System.out.println("I like the car "+car.getCar_model() );
        car.setCar_model("eon");
          System.out.println("I like the car "+car.getCar_model() );
   	        Car car1 = context.getBean(Car.class);
   	         
        
        
        System.out.println("I like the car "+car1.getCar_model() );
    }
}
