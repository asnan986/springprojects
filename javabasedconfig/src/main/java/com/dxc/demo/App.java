package com.dxc.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        
        Hostel hostel= (Hostel)ac.getBean("hostel");
        System.out.println("my hostel name is "+hostel.getHostelname());
        System.out.println("my hostel location is "+ hostel.getHostelLocation());
        System.out.println("no.of members in my hostel "+hostel.getHostelmembers());
        System.out.println("no.of rooms in my hostel "+hostel.getHostelRooms());
        
    }
}
