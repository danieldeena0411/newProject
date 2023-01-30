package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		txtbox.sendKeys("iphone 12");
		
		Thread.sleep(5000);
		
		List<WebElement> search = driver.findElements(By.xpath("//div[@role='button']"));
		
		for(WebElement webElement:search) {
			
			System.out.println(webElement.getText());
		}
		
}
}