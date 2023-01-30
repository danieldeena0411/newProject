package org.test;

import org.testng.annotations.Test;

public class TngTask5a {
	
	@Test(groups = "Csk")
	private void tc11() {
	
		System.out.println("Test Case 11");

	}
	
	@Test(groups = "Mi")
	private void tc12() {
	
		System.out.println("Test Case 12");

	}
	
	@Test(groups = "Rcb")
	private void tc13() {
	
		System.out.println("Test Case 13");

	}
	
	@Test(groups = {"Csk","Mi"})
	private void tc14() {
	
		System.out.println("Test Case 14");

	}





}
