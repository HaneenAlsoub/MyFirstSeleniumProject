package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTests {

	public static void main(String[] args) {
		
		// open chrome 
		
		//C:\Users\hanee\Documents\Selenium dependecies\Drivers\chromedriver
		
		System.setProperty ("webdriver.chrome.drive"," "
				+ "\\Users\\hanee\\Documents\\Selenium dependecies\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// go to url www.google.com
		// get : opens the website
		driver.get("https://amazon.com/");

		// varify title
		//expected : Google
		
		String expected = "Google";
		// get title () gets the title of the tab
		String actual = driver.getTitle();
		System.out.println(actual);
		
		if(expected.equals(actual)) {
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
		}
	}

}
