package org.man;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ab extends Sa {
	
	public static void main(String[] args) throws IOException   {
		
		browserLaunch();
		maxWindow();
		launchUrl("https://www.facebook.com/");
		
		screenShot("fb4");
		
		WebElement emailTxt = driver.findElement(By.id("email"));
		
		passTxt("selenium", emailTxt);
		
		
		screenShot("fb5");
		
		WebElement pasTxt = driver.findElement(By.name("pass"));
		
		passTxt("7452122", pasTxt);
		
		screenShot("fb6");
		
	}

	private static void passTxt(String string, WebElement emailTxt) {
		// TODO Auto-generated method stub
		
	}

	
		
	}

}
