package com.kc.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

	 @InjectMocks
	 private Calculator calculator;

	@Test
	public void sholdAddTwoNumbers() {
		Integer a=10;
		Integer b=20;
		
		Integer total=(Integer) calculator.addNumbers(a,b);
		
		//assertEquals( total, a+b);		
	}
	
	@Test
	public void sholdThrowExceptionIFParameterIsNull() {
		
	//	int total=calculator.addNumbers(10,Null);
	}

}
