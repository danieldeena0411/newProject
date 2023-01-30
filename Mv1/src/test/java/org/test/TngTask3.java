package org.test;

import java.util.Date;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TngTask3 {
	
public WebDriver driver;
	
	@BeforeClass
	private void pre() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
@Test

private void tc1() {

	driver.get("https://www.meesho.com/");

}

@BeforeMethod

private void startDate() {
	Date d = new Date();
	System.out.println(d);

}


@Test

private void tc2() {
	driver.get("https://www.amazon.in/");
}


@AfterClass

private void preCon() {
driver.quit();	
}

@DataProvider(name="Datapro")
private Object[][]sampleDatas(){
	return new Object[][] {
		{"danidcd@gmail.com" , "Dcd@143"},
		{"denverdemo@gmail.com" , "Demo@123"},
		{"christamero17@gmail.com" ,"Chero@777"},
		{"charlie777@gmail.com" , "Char@777"}
		
		
	};
}


@AfterMethod

private void end() {

	Date d = new Date();
	System.out.println(d);
}


@Test(dataProvider="Datapro") 
private void tc3(String eml, String pass) {
driver.get("https://www.facebook.com/");

driver.findElement(By.id("email")).sendKeys(eml);
driver.findElement(By.name("pass")).sendKeys(pass);

}

}


