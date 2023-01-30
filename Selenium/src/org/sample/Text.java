package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Text {
public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	WebElement frg = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	frg.click();
}
}
