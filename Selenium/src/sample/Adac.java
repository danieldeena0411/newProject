package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adac {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement user = driver.findElement(By.id("username"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value', 'hotel')",user);
		
		WebElement pwd = driver.findElement(By.id("password"));
		
		js.executeScript("arguments[0].setAttribute('value' ,'12345')",pwd);
		
		
		WebElement logins = driver.findElement(By.id("login"));
		
		js.executeScript("arguments[0].click()",logins);
		
		

		
		
		
		
		
		
		
		
		
	}

}
