package org.test;

import org.testng.annotations.Test;

public class TngTask5 {
	
	
	@Test(groups = "Rcb")
	private void tc1() {
	
		System.out.println("Test Case 1");

	}
	
	@Test(groups = "Csk")
	private void tc2() {
	
		System.out.println("Test Case 2");

	}
	
	
	@Test(groups = "Mi")
	private void tc3() {
	
		System.out.println("Test Case 3");

	}

	@Test(groups = {"Rcb","Csk"})
	private void tc4() {
	
		System.out.println("Test Case 4");

	}


}
