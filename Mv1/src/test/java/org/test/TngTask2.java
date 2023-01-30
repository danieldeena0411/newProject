package org.test;

import org.testng.annotations.Test;

public class TngTask2 {
	
	
	@Test
	private void tc1() {
		
		System.out.println("Test Case No :1");
		
	}

	@Test(priority=-7)
	private void tc2() {
		
		System.out.println("Test Case No :2");
		
	}

	@Test(priority=-17)
	private void tc3() {
		
		System.out.println("Test Case No :3");
	}

	@Test(priority=-17)
	private void tc4() {
		
		System.out.println("Test Case No :4");
	}

	@Test(priority=-4,invocationCount=2)
	private void tc5() {
		
		System.out.println("Test Case No :5");
	}

	@Test(enabled=false)
	private void tc6() {
		
		System.out.println("Test Case No :6");
	}


}
