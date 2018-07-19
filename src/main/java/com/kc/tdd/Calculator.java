package com.kc.tdd;

import java.security.InvalidParameterException;

public class Calculator {

	public Object addNumbers(Object i, Object j) {
		Integer result=null;
		if(i instanceof Number && j instanceof Number)
		{
			Integer number1=(Integer) i;
			Integer number2=(Integer) j;
			result=number1+number2;
		}		
		else {
			return new InvalidParameterException();
		}
		return result;
			
	}

}
