package sample;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ds {
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://output.jsbin.com/osebed/2");

		WebElement fruitd = driver.findElement(By.id("fruits"));
		
		List<WebElement> allopts = driver.findElements(By.tagName("option"));
		
		for (int i = 0; i < allopts.size(); i++) {
			
			WebElement itr = allopts.get(i);
			
			String opt = itr.getText();
			
			System.out.println(opt);

			if (opt.equals("Grape")) {
				
				itr.click();
				
			}
			
			
		}
		
		
		
		
		
}

}
