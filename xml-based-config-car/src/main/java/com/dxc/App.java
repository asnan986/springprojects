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
        System.out.println("This model is designed by "+ car.getCar_brand());
        System.out.println("The car is of cost "+ car.getCar_price());
        System.out.println("It is having an engine capacity of "+car.getCar_cc());
    }
}
