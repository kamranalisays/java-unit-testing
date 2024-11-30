package org.expandablesupportservices.testwithorderofclasses;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(2)
public class ProductServiceTest {

	
	@BeforeAll
	static void beforeAllMethod()
	{}
	
	@Test
	void testProductService()
	{}
	

}
