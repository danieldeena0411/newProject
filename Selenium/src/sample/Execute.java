package sample;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execute {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		
		WebElement user = driver.findElement(By.id("email"));
		JavascriptExecutor j = (JavascriptExecutor)driver;

		j.executeScript("arguments[0].setAttribute('value','Deena')",user);
		
		
		Object usr = j.executeScript("return arguments[0].getAttribute('value')",user);
		
		System.out.println(usr);
		
		
		
	WebElement pwd = driver.findElement(By.id("pass"));
		
		j.executeScript("arguments[0].setAttribute('value', '12345')",pwd);
		WebElement loginbn = driver.findElement(By.name("login"));
		
	j.executeScript("arguments[0].click()", loginbn);
		
	
				
	}

}
