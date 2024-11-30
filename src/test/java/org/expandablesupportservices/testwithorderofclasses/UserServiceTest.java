package org.expandablesupportservices.testwithorderofclasses;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(3)
public class UserServiceTest {

	
	@BeforeAll
	static void beforeAllMethod()
	{}
	
	@Test
	void testUserService()
	{}
	

}
