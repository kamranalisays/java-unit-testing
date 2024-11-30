package org.expandablesupportservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class TestMethodwithMethodNameOrder {

	
	@Test
	void testMethodD()
	{ assertEquals("D", "D");}
	

	@Test
	void testMethodA()
	{ assertEquals("A", "A");}
	
	@Test
	void testMethodC()
	{ assertEquals("C", "C");}

	@Test
	void testMethodB()
	{ assertEquals("B", "B");}
	


	
	
}
