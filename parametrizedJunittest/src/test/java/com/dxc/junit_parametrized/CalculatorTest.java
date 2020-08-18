package com.dxc.junit_parametrized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;





@RunWith(Parameterized.class)
public class CalculatorTest  {
	
	private int input1;
	private int input2;
	private int expected;
	private Calculator calculator;
	
	@Before
	public void init() {
		calculator = new Calculator();
	}
	
	
    public CalculatorTest(int input1, int input2, int expected) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expected = expected;
	}
    
    @Parameters
    public static Collection<Object[]> testParameter(){
    	Object[][] object = new Object[][] {{2,3,5},{2,8,10},{5,6,11}};
    	return Arrays.asList(object);
    	
    }


	@Test
	public void testAdd() {
		
		assertEquals(expected,calculator.add(input1, input2));
		
	}
    @Test
	public void testSub() {
    	assertNotEquals(expected,calculator.sub(input1, input2));
	}

}
