package pro2.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("thanjavur");
		
		
		WebElement to = driver.findElement(By.id("dest"));
		
		
		to.sendKeys("bangalore");
		
		
		
		 
		WebElement searchbus = driver.findElement(By.id("search_btn"));
		searchbus.click();
	}

}
