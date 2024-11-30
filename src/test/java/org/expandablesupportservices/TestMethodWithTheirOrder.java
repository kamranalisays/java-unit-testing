package org.expandablesupportservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestMethodWithTheirOrder {

	@Order(1)
	@Test
	void testMethodD()
	{ assertEquals("D", "D");}
	
	@Order(2)
	@Test
	void testMethodA()
	{ assertEquals("A", "A");}
	
	@Order(3)
	@Test
	void testMethodC()
	{ assertEquals("C", "C");}

	@Order(4)
	@Test
	void testMethodB()
	{ assertEquals("B", "B");}
	


	
}
