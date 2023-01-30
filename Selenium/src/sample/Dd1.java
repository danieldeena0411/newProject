package sample;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd1 {
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://output.jsbin.com/osebed/2");

		WebElement fruits1 = driver.findElement(By.id("fruits"));

		Select s = new Select(fruits1);
		
		boolean mul = s.isMultiple();
		
		System.out.println(mul);
		
		s.selectByVisibleText("Apple");
		
		s.selectByIndex(2);
		
		s.selectByIndex(0);
		
		List<WebElement> allSelected = s.getAllSelectedOptions();
		
		for (WebElement itr : allSelected) {
			
			System.out.println(itr.getText());
			
			}
		
		WebElement firstOpt = s.getFirstSelectedOption();
		
		System.out.println(firstOpt.getText());
		
//		s.deselectAll();
		
		s.deselectByValue("apple");
		
		
		
		
}


}
