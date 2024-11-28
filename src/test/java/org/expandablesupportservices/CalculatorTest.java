package org.expandablesupportservices;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


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

	@ParameterizedTest
	@MethodSource("subtractionInputParameters")
	void test_subtraction(int a , int b ,int c)
	{
		assertEquals(c, calculator.subtraction(a, b));
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
		assertThrows(ArithmeticException.class, ()-> { calculator.division(2, 0); } );
	}
	

	private static Stream<Arguments>  subtractionInputParameters()
	{
		return Stream.of(
				Arguments.of(10,9,1),
				Arguments.of(25,23,2),
				Arguments.of(12,7,4)
				);
	}
	
	
}
