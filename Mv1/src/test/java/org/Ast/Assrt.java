package org.Ast;



import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.pojo.classes.LoginPOJO;
import org.smes.Base;

public class Assrt extends Base{
@BeforeClass
	
	public static void precondition() {
		browserLaunch();
		maxWindow();
		
	}
	
	@Ignore
	@Test
	
	public void tc2() {
		
		urlLaunch("https://www.amazon.in/");
		
	}
	
	@Before
	public void startDate() {
		Date dt = new Date();
		System.out.println(dt);
	}
	@Test
	
	public  void tc1() {
		urlLaunch("http://adactinhotelapp.com/");
		
		String title= getTitle();
		LoginPOJO l = new LoginPOJO();
		passTxt(title, l.getLid());
		Assert.assertEquals("Checkthe Title TC1", "Adac","Adac");
		passTxt("Maverick",l.getLid() );
		passTxt("1458724", l.getPwd());
		click(l.getLgn());
	}
	
	
	@After
	
	public void endDate() {
		
		Date dt = new Date();
		
		System.out.println(dt);
	}

	@Test
	
	public void tc3() {
		urlLaunch("https://www.facebook.com/");
		String title = getTitle();
		LoginPOJO l = new LoginPOJO();
		Assert.assertTrue(title.contains("Facebook"));
		passTxt("Junit", l.getEmailTxt());
		passTxt("142584", l.getPasswordTxt());
		
		click(l.getLoginBtn());
	}
	
	@AfterClass
	
	public static void postCondition()  {
		
	
	CloseWin();
	}
	


}
