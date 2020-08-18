package com.dxc.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExceptionDemoTest {
	
	
	private ExceptionDemo exceptionDemo;
	
   @Before
   public void init() {
	   
	   exceptionDemo= new ExceptionDemo();
	   
   }
	@Test(expected= ArithmeticException.class)
	public void testArithmeticCalculation() {
		exceptionDemo.arithmeticCalculation();
		//fail("Not yet implemented");
	}

}
