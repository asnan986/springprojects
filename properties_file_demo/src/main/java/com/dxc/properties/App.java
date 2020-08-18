package com.dxc.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dxc.properties.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
          Student student = (Student)ac.getBean("user");
          
          System.out.println("The username of the student is "+student.getUsername());
          System.out.println("The password of the student is "+ student.getPassword());
          
        
    }
}
