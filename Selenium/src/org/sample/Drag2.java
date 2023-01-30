package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag2 {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement s = driver.findElement(By.name("email"));
		
		Actions a = new Actions(driver);
		a.keyDown(Keys.SHIFT).perform();
		a.sendKeys("deena").perform();
		a.keyUp(Keys.SHIFT).perform();
		a.doubleClick(s).contextClick(s).perform();
		
		Robot r= new Robot();
		
		for (int i = 0; i <=2; i++) {
		
			r.keyPress(KeyEvent.VK_DOWN);
			
			r.keyRelease(KeyEvent.VK_DOWN);
		}
	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
	
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
