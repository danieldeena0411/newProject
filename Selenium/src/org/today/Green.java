package org.today;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Green {
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstechnologys.com/");
		
		TakesScreenshot t = (TakesScreenshot)driver;
		
		File sr = t.getScreenshotAs(OutputType.FILE);
		
		File dt = new File("C:\\Users\\Dell\\eclipse-workspace\\Selenium\\Img\\m.png");
		
		FileUtils.copyFile(sr, dt);
		
		
		
		
		
		
		
		
	}

}
