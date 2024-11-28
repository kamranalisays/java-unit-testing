package org.expandablesupportservices;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
	

	
	@Test
	void test_addition()
	{
		Calculator calculator=new Calculator();
		assertEquals(4, calculator.addition(2, 2));
	}

	@Test
	void test_subtraction()
	{
		Calculator calculator=new Calculator();
		assertEquals(2, calculator.subtraction(4, 2));
	}

	
	@Test
	void test_multiplication()
	{
		Calculator calculator=new Calculator();
		assertEquals(16, calculator.multiplication(4,4) ,()-> "it does not produce expected output");
		
	}
	
	@DisplayName(" division by 0 ")
	@Test
	void test_division()
	{
		
		Calculator calculator=new Calculator();
		assertThrows(ArithmeticException.class, ()-> calculator.division(2, 0) );
	}
	
	 
}
