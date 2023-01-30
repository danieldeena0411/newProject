package org.test;

import org.testng.annotations.Test;

public class TngTask2b {
	
	@Test(priority=-5)
	private void tc21() {
		
		System.out.println("Test Case No : 21");
	}

	

	@Test(priority=0)
	private void tc12() {
		
		System.out.println("Test Case No : 22");
	}
	

	@Test(enabled=false)
	private void tc13() {
		
		System.out.println("Test Case No : 23");
	}
	
	@Test(priority = -12)
	
	private void tc14() {
		System.out.println("Test Case No :24");
	}


}
