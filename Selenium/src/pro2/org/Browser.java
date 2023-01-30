package pro2.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement username= driver.findElement(By.id("email"));
		
		username.sendKeys("daniel@04");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("daniel00343");
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
	}

}
