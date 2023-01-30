package org.sample;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium\\drivers\\msedgedriver.exe" );
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
	}

}
