package org.test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TngTask6b {
	
	@Test
	private void tc21() {
		
		System.out.println("TC21 : "+Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/");


}

	@Test
	private void tc22() {
		
		System.out.println("TC22 : "+Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
	}
		
		@Test
		private void tc23() {
			
			System.out.println("TC23 : "+Thread.currentThread().getId());
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.meesho.com/");
			
			


}


}
