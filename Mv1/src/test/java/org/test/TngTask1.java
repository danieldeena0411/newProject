package org.test;

import java.util.Date;


import org.junit.AfterClass;

import org.openqa.selenium.WebDriver;
import org.pojo.classes.LoginPOJO;
import org.smes.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TngTask1 extends Base{
	
	public WebDriver driver;
@BeforeClass
	
	private void preCondition() {
		browserLaunch();
		maxWindow();
		
	}
	
	@Test(enabled = false)
	
	private void tc3() {
		
		urlLaunch("https://www.meesho.com/");
	}
	
	@BeforeMethod
	
	private void StartDate() {
		
		Date dt = new Date();
		System.out.println(dt);
	}
	
	@Test(invocationCount=3)
	
	public void tc1() {
	urlLaunch("https://www.facebook.com/");	
	
	}
	
	
	@AfterClass
	
	private void postCondition()  {
	
		CloseAllWin();
		
	}
	
	@AfterMethod
	
	private void endDate() {
		Date dt = new Date();
		System.out.println(dt);

	}
	
	@Test
	
	private void tc2() {
	urlLaunch("http://adactinhotelapp.com/");
	LoginPOJO l = new LoginPOJO();
	passTxt("Daniel", l.getLid());
	passTxt("5225244", l.getPwd());
	
}


}