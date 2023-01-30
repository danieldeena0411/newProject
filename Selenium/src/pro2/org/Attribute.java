package pro2.org;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attribute {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		String t1 = username.getAttribute("class");
		System.out.println("class:"+t1);
		
		String t2 = username.getAccessibleName();
		System.out.println("placeholder:"+t2);
		username.sendKeys("daniel@4");
	String t3 = username.getAttribute("value");
		
		username.getAttribute("value");
	
		System.out.println(t3);
	}
	}


