package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		//browser Config
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe" );
		//Instatiations
		WebDriver driver =new ChromeDriver();
		
		//to pass the url
		driver.get("https://www.youtube.com/");
		
	
		driver.findElement(By.name("search_query")).sendKeys("ini oru vidhi seivom");
		driver.findElement(By.name("search_query")).sendKeys(""+Keys.ENTER);
		
		// to fetchthe title
		
		String title = driver.getTitle();
		
		System.out.println("\"Title:\"+title");
		
		// to fetch the url
		
		String url =driver.getCurrentUrl();
		System.out.println("https://about.facebook.com/"+url);
		
		
		
		
	}

}
