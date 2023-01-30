package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TngTask4 {
	
	@Test
	
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		driver.findElement(By.id("email")).sendKeys("Dazzingdcd@gmail.com");
		
		//Hard Assert
		
		Assert.assertTrue(false);  //failed
		
		driver.findElement(By.name("pass")).sendKeys("DcdDnA@444");

	}
	
	@Test
	
	private void tc2() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://adactinhotelapp.com/");
		
		
		String title = driver.getTitle();
		
		driver.findElement(By.id("username")).sendKeys("Smd@174");
		
		//soft assert
		
		SoftAssert s = new SoftAssert();
		
		s.assertTrue(false); // failed

		driver.findElement(By.name("password")).sendKeys("DlniAnDdacD");

		s.assertAll(); // Assert Masked as Failed
		
	}

}
