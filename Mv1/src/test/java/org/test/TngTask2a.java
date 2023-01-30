package org.test;

import org.testng.annotations.Test;

public class TngTask2a {
	
	
	@Test
	private void tc11() {
		
		System.out.println("Test Case No : 11");
	}

	

	@Test(priority=5)
	private void tc12() {
		
		System.out.println("Test Case No : 12");
	}
	

	@Test(priority=-12)
	private void tc13() {
		
		System.out.println("Test Case No : 13");
	}
	
	@Test(priority = 0,invocationCount=2)
	
	private void tc14() {
		System.out.println("Test Case No :14");
	}
}
