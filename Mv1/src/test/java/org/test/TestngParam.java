package org.test;

import java.util.Date;

import org.junit.AfterClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.smes.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngParam extends Base {

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



@AfterMethod

private void end() {

	Date d = new Date();
	System.out.println(d);
}

@Parameters({"emailTxt","passTxt"})
@Test 
private void tc3(@Optional("selejdk@gmail.com")String eml,@Optional("javaseleni@gmail.com") String pass) {
driver.get("https://www.facebook.com/");

driver.findElement(By.id("email")).sendKeys(eml);
driver.findElement(By.name("pass")).sendKeys(pass);

}

}