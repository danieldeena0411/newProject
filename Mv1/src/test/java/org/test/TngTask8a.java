package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TngTask8a {

	@Test(retryAnalyzer=FailedCase.class)
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("denverdemo@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Demo@123");

	}
	
	@Test(retryAnalyzer=FailedCase.class)
	private void tc2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("dna444@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Deen@123");

	}

	@Test(retryAnalyzer=FailedCase.class)
	private void tc3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("dxdna@gmail.com");
		
		Assert.assertTrue(false);
		
		
		driver.findElement(By.name("pass")).sendKeys("Mrd@123");

	}



}
