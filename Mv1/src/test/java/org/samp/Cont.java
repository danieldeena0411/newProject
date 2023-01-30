package org.samp;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cont {
	public static WebDriver driver;
	
public static void browserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
	}
	
	public static void maxWindow() {
		
		driver.manage().window().maximize();
		
	}
	
	public static void launchUrl(String url) {
		
		driver.get(url);
		
		
}

	

}
