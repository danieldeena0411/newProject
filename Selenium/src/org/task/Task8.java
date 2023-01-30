package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	
	
		
		public static void main(String[] args) {
			

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://retail.onlinesbi.com/retail/login.htm");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
		
			
			
		
			
			WebElement lg = driver.findElement(By."));
			
			js.executeScript("arguments[0].click()", lg);
//			
//			
//			js.executeScript("arguments[0].setAttribute('value','deena'" ,us);
//			
//			WebElement ps = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
//			
//			js.executeScript("arguments[0].setAttribute('value','12345'", ps);
//			
//			WebElement lg = driver.findElement(By.name("Action.VALIDATE_CREDENTIALS"));
//			
//			
			
			
		}

}
