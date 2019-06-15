package com.qa.seleniumGet;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Daniel Little/Desktop/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testGetFunc() {
		
	}
}
