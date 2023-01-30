package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TngTask6 {
	
	@Test
	
	private void tc1() {
		
		System.out.println("TC1 : "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("danidcd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Dcd@143");

	}
	
	@Test
	private void tc2() {
		
		System.out.println("TC2 : "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("denverdemo@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Demo@123");

	}
	
	@Test
	private void tc3() {
		
		System.out.println("TC3 : "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("christamero17@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Chero@777");

	}
	
	
}
