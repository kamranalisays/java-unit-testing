package org.expandablesupportservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

public class TestRectangle {
	
	Rectangle rectangle;
	
	@BeforeEach
	void beforeEachMethod()
	{
		rectangle=new Rectangle();
		
	}
	
	
	@RepeatedTest(4)
	void test_calculateArea()
	{
		assertEquals(8, rectangle.calculateArea(4, 2));
		
	}
	
	
}
