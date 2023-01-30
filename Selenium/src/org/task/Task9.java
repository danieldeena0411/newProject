package org.task;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task9 {
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement acbt = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		acbt.click();
		
		Thread.sleep(2000);
		
		WebElement monthdt = driver.findElement(By.name("birthday_month"));
		
		Select s = new Select(monthdt);
		
//		s.selectByIndex(5);
		
//	s.selectByVisibleText("Nov");
//		
//		s.selectByValue("4");
//	
//		boolean mul = s.isMultiple();
//		
//		System.out.println(mul);
//		
		List<WebElement> allopts = s.getOptions();
		
		WebElement opt = allopts.get(1);
		
		System.out.println(opt.getText());
		
		for (WebElement itr : allopts) {
			
			{
				System.out.println(itr.getText());
			}
			
		}
		
		
		
		
		
		
		
		

}
}