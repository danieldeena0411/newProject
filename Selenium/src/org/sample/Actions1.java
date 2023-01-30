package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(course).perform();
		WebElement Software  = driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
		a.moveToElement(Software).perform();
		WebElement selenium = driver.findElement(By.xpath("//span[text()='Selenium']"));
		a.moveToElement(selenium).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
