package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TngTask8 {
	public WebDriver driver;
	
	
	@Parameters("browser")
	@Test
	
	private void tc1(String browserName) {
		
		if (browserName.equals("chromebrowser")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
		}
		
		else if (browserName.equals("firefoxbrowser")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
		}
	
		else {
			
			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nike.com/in");
	}
	
}

