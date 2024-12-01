package org.expandablesupportservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestMethodWithTheirOrder {

	StringBuilder stringBuilder=new StringBuilder("");
	
	@AfterAll
	void afterAllMethod() {
		
		System.out.println(stringBuilder);
		
	}
	
	@Order(1)
	@Test
	void testMethodD()
	{ 
		stringBuilder.append("1");
		assertEquals("D", "D");}
	
	@Order(2)
	@Test
	void testMethodA()
	{ 
		stringBuilder.append("2");
		assertEquals("A", "A");}
	
	@Order(3)
	@Test
	void testMethodC()
	{ 
		stringBuilder.append("3");
		assertEquals("C", "C");}

	@Order(4)
	@Test
	void testMethodB()
	{ 
		stringBuilder.append("4");
		assertEquals("B", "B");
		
	}
	


	
}
