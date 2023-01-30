package org.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert al = driver.switchTo().alert();
		
		String info = al.getText();
		
		System.out.println(info);
		
		al.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
