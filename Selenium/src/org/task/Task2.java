package org.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	
	
	
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	 driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	 
	 Alert a = driver.switchTo().alert();
	String s = a.getText();
	 System.out.println(s);
	 
a.dismiss();

	
	
	
	
	
	
	
	
	
	
}
		
		
	
	
	
	
	
	
	
	
	
	

}
