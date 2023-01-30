package org.excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.smes.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exe extends Base{
	

		public static void main(String[] args) throws IOException {
			
		readExcel(0, 1);
		
		
	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			WebElement emailTxt = driver.findElement(By.name("email"));
			
			emailTxt.sendKeys(readExcel(0, 1));
			
			
			
		}
		}		
	        

		
		
		
	
	
	
	


