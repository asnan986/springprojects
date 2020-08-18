package com.dxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.model.College;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Springcore-ioc.xml");
        
        College college =context.getBean(College.class);
        
        System.out.println("I'am studied in "+college.getCollegeName()) ;
        System.out.println("The college is located in the heritage city of Kerala, "+college.getCollegeLocation());
        System.out.println("The college is established in " + college.getYear_estd());
        System.out.println("There are "+college.getNo_of_dept()+" courses offered by the government");
        System.out.println("They are "+college.getDeptNames());
        
    }
}
