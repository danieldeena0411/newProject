package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
	username.sendKeys("deena@44");	
	
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("danieldeena");
	
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
	
	
	}
}
