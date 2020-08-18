package com.dxc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.model.Car;
import com.dxc.model.Driver;

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
        Driver address = (Driver)context.getBean("driver1");
        System.out.println("The car model is "+car.getCar_model());
        System.out.println("The driver of the car is "+car.getDriver().getDriverName());
       System.out.println("driver speed is "+ address.getDriverSpeed());
    }
}
