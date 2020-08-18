package com.dxc.junit;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class CompareArrayTest {
	
	@Test
	public void comparearraytest() {
		
		int expectedarray[]= {12,13,14,15};
		int actualarray[]= {12,15,14,13};
		Arrays.sort(actualarray);
		 assertArrayEquals(expectedarray, actualarray);
		
	}
			
			
			
			

}
