package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("(//li[@class='block14 ui-draggable'])"));
		
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions a = new Actions(driver);
		
		
		a.dragAndDrop(src, des).perform();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
