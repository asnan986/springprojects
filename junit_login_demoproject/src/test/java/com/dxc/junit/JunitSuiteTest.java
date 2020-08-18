package com.dxc.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.dxc.junit.service.LoginServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	ExceptionDemoTest.class,
	LoginServiceTest.class,
	CompareArrayTest.class})

public class JunitSuiteTest {
	
	
	

}
