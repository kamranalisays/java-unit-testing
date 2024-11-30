package org.expandablesupportservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;




@TestMethodOrder(MethodOrderer.Random.class)
public class MethodTestsWithRandomOrder {
	
	
	@Test
	void testMethodA()
	{ assertEquals("A", "A");}

	@Test
	void testMethodB()
	{ assertEquals("B", "B");}
	
	@Test
	void testMethodC()
	{ assertEquals("C", "C");}
	
	@Test
	void testMethodD()
	{ assertEquals("D", "D");}
	
	
	
}
