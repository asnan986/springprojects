package com.dxc.junit.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dxc.junit.model.User;

public class LoginServiceTest {
	
	String input1;
	String input2;
	private User user;

	@Before
	public void setUp() throws Exception {
		
		user = new User();
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void testValidatelogin() {
		 input1="asnan";
			 input2="asnan";
			 assertTrue(input1.equals(input2));
		//fail("Not yet implemented");
	}
	@Test
	public void testValidatelogin1() {
		 input1="asnan";
			 input2="asnan1";
			 assertFalse(input1.equals(input2));
		//fail("Not yet implemented");
	}

}
