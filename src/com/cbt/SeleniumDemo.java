package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	public static void main(String[] args) {
		//set system properties
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hanee\\Documents\\Selenium dependecies\\Drivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		WebDriver driver2 = new ChromeDriver();
		driver.get("http://amazon.com");
		
		WebDriver driver3 = new ChromeDriver();
		driver.get("http://ebay.com");
		
		WebDriver driver4 = new ChromeDriver();
		driver.get("http://cybertek.com");
		
		
		
		driver.close();
		
	}

}
