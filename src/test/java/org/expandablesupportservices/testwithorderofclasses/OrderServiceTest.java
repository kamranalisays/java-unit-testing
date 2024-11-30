package org.expandablesupportservices.testwithorderofclasses;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(1)
public class OrderServiceTest {
	
	@BeforeAll
	static void beforeAllMethod()
	{}
	
	@Test
	void testOrderService()
	{}
	

}
