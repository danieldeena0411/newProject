package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TngTask3a {
	
	@Test(dataProvider="Datapro" , dataProviderClass = TngTask3.class) 
	private void tc3(String eml, String pass) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys(eml);
		driver.findElement(By.name("pass")).sendKeys(pass);


	}

}
