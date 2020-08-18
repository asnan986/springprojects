package com.dxc.junit.runner;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.dxc.junit.JunitSuiteTest;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Result result = JUnitCore.runClasses(JunitSuiteTest.class);
		
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());

		
		

	}

}
