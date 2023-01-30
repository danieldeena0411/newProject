package org.test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TngTask6a {
	
	@Test
	private void tc11() {
		
		System.out.println("TC11 : "+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");


}

	@Test
	private void tc12() {
		
		System.out.println("TC12 : "+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
	}
		
		@Test
		private void tc13() {
			
			System.out.println("TC13 : "+Thread.currentThread().getId());
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			


}


}