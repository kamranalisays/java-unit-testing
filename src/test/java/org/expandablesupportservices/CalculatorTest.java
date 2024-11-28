package org.expandablesupportservices;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

	
	Calculator calculator;
	
	@BeforeAll
	static void setup()
	{
		System.out.println("execute @BeforeAll method");
	}
	
	@AfterAll
	static void cleanUp()
	{
		System.out.println("execute @AfterAll method");
	}

	@BeforeEach
	void beforeEachMethod() {
		
		System.out.println("execute @BeforeEach method");
		calculator=new Calculator();
	}
	
	@AfterEach
	void afterEachMethod()
	{
		System.out.println("execute @AfterEach method");
	}
	
	
	@Test
	void test_addition()
	{
		
		assertEquals(4, calculator.addition(2, 2));
	}

	@Test
	void test_subtraction()
	{
		
		assertEquals(2, calculator.subtraction(4, 2));
	}

	
	@Test
	void test_multiplication()
	{
		
		assertEquals(16, calculator.multiplication(4,4) ,()-> "it does not produce expected output");
		
	}
	
	@DisplayName(" division by 0 ")
	@Test
	void test_division()
	{
		
		
		assertThrows(ArithmeticException.class, ()-> calculator.division(2, 0) );
	}
	
	 
}
