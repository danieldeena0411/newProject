package org.today;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fm {

	
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/guru99home/");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement scroll = driver.findElement(By.xpath("//h3[contains(text(),'adBlock')]"));
		
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		
		driver.switchTo().frame("a077aa5e");
		
//		WebElement fs = driver.findElement(By.xpath("//iframe[@src='ads.html']"));
//		
//		driver.switchTo().frame(fs);
		
		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		img.click();
		
		
		

}
}