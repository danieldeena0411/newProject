package org.test;

import org.testng.annotations.Test;

public class TngTask5b {

	
	@Test(groups = "Mi")
	private void tc21() {
	
		System.out.println("Test Case 21");

	}
	
	@Test(groups = "Rcb")
	private void tc22() {
	
		System.out.println("Test Case 22");

	}
	
	@Test(groups = "Csk")
	private void tc23() {
	
		System.out.println("Test Case 23");

	}
	
	@Test(groups = {"Mi","Rcb"})
	private void tc24() {
	
		System.out.println("Test Case 24");

	}




}
