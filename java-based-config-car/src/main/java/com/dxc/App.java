package com.dxc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.dxc.config.SpringConfig;
import com.dxc.model.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext acac= new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Car car = acac.getBean(Car.class);
    	
        System.out.println("I like the car "+car.getCar_model() );
        System.out.println("This model is designed by "+ car.getCar_brand());
        System.out.println("The car is of cost "+ car.getCar_price());
        System.out.println("It is having an engine capacity of "+car.getCar_cc());
    }
}
