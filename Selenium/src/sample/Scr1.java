package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scr1 {
	
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://greenstech.in/selenium-course-content.html");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement link = driver.findElement(By.id("heading304"));
		
		js.executeScript("arguments[0].scrollIntoView(false);", link);
		
		
		



}	

}
