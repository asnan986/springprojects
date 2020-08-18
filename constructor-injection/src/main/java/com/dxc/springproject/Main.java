package com.dxc.springproject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


/**
 * Hello world!
 *
 */
public class Main 
{

 
  
public static void main(String[]  args) {
	//Resource resource = new ClassPathResource("spring-ioc.xml");
	//Resource resource1= new FileSystemResource("C:\Users\amh2\spring tool workspace\springprojectdemo\resources\spring-ioc.xml");
	BeanFactory beanfactory  = new XmlBeanFactory(new ClassPathResource("spring-ioc.xml"));
	//ioc- inversion of control...that is how to load 
	
	Student student = (Student)beanfactory.getBean("student");
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
	//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext("")
	Student student1= (Student)context.getBean("student");
	
	
	//ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
	// if the 
	//ApplicationContext context1 = new FileSystemXmlApplicationContext("C:\\Users\\amh2\\spring tool workspace\\springprojectdemo\\resources\\spring-ioc.xml");
	//Student student1 = context.getBean(Student.class);
	
	System.out.println(student.sname);
	System.out.println(student.department);
	System.out.println(student.email);
	System.out.println(student.id);
	System.out.println(student.bonus);
	//System.out.println(student.bonus);
	
}
}
