package org.ddr;


import org.pojo.classes.LoginPOJO;
import org.smes.Base;

public class Sampom extends Base {
	
	

	public static void main(String[] args) {
		 
		browserLaunch();
		maxWindow();
		urlLaunch("https://www.facebook.com/");
		
		LoginPOJO l = new LoginPOJO();
		
		passTxt("Java",l.getEmailTxt());
		passTxt("544225", l.getPasswordTxt());

		driver.navigate().refresh();	
		
		passTxt("Selenium", l.getEmailTxt());
		passTxt("4552222", l.getPasswordTxt());
		
		click(l.getLoginFindAll());
		
		
		
		
		
	}


		
}

	








