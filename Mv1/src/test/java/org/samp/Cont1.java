package org.samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cont1 extends Cont {
	
	public static void main(String[] args) {
	
	browserLaunch();
	maxWindow();
	launchUrl("https://www.facebook.com/");
	
	WebElement txt = driver.findElement(By.xpath("//h2[contains(text(),'share')]"));
	String sd = txt.getText();
	System.out.println(sd);
	
	

}
}