package com.dxc;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.dxc.model.Car;
import com.dxc.config.SpringConfig;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext acac = new AnnotationConfigApplicationContext(SpringConfig.class);
       Car car1 =(Car)acac.getBean("car");
       
       System.out.println("car name "+car1.getCarName());
       System.out.println("car engine type "+ car1.getEnginetype().getEnginecapacity());
       
        
    }

	
}
