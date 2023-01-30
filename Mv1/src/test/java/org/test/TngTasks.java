package org.test;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TngTasks {
	
	@BeforeClass
	
	private void preCondition() {
		System.out.println("Browser Launch");
		
	}
	
	@Test(enabled = false)
	
	private void tc3() {
		
		System.out.println("Test Case 3");
	}
	
	@BeforeMethod
	
	private void StartDate() {
		
		System.out.println("Test Case Starting Date");
	}
	
	@Test(invocationCount=3)
	
	private void tc1() {
		
		System.out.println("Test Case 1");
	}
	
	
	@AfterClass
	
	private void postCondition() {
		
		System.out.println("Close the Browser");
	}
	
	@AfterMethod
	
	private void endDate() {
		System.out.println("Test Case End Date");

	}
	
	@Test
	
	private void tc2() {
		System.out.println("Test Case 2");
	}
	
}
	




