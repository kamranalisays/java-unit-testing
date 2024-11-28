package org.expandablesupportservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	void addition()
	{
		Calculator calculator=new Calculator();
		assertEquals(4, calculator.addition(2, 2));
	}

	@Test
	void subtraction()
	{
		Calculator calculator=new Calculator();
		assertEquals(2, calculator.subtraction(4, 2));
	}
	
	@Test
	void multiplication()
	{
		Calculator calculator=new Calculator();
		assertEquals(16, calculator.multiplication(4, 4));
		
	}
	
	
	
}
