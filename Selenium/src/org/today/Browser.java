package org.today;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File s = ts.getScreenshotAs(OutputType.FILE);
		
		
		File des = new File("C:\\Users\\Dell\\eclipse-workspace\\Selenium\\Img\\pic.png");
		
		FileUtils.copyFile(s, des);
		
		
}
	
}
