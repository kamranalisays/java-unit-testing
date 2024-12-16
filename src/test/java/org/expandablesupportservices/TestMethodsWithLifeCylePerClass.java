package org.expandablesupportservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestMethodsWithLifeCylePerClass {
	
	
StringBuilder stringBuilder=new StringBuilder("");
	
	@AfterAll
	void afterAllMethod() {
		
		System.out.println(stringBuilder);
		
	}
	
	@Test
	void testMethodD()
	{ 
		stringBuilder.append("1");
		assertEquals("D", "D");}
	

	@Test
	void testMethodA()
	{ 
		stringBuilder.append("2");
		assertEquals("A", "A");}
	

	@Test
	void testMethodC()
	{ 
		stringBuilder.append("3");
		assertEquals("C", "C");}

	
	@Test
	void testMethodB()
	{ 
		stringBuilder.append("4");
		assertEquals("B", "B");
		
	}
	

}
