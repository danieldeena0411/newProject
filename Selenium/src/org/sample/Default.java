package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Default {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement Account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Account.click();
		
		Thread.sleep(5000);
		
		
		WebElement txtbox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		txtbox.click();
		
		txtbox.sendKeys("deena");
		
		WebElement mobnum = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		
		mobnum.click();
		mobnum.sendKeys("8542125434");
		
		
	
	}

}
