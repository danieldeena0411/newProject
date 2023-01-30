package org.samp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		
	}
	
	public static void maxWindow() {
		
		driver.manage().window().maximize();
		
	}
	
	public static void launchUrl(String url) {
		
		driver.get(url);
		
	}
	
		
	}


