package com.qa.seleniumCreate;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Runner {

WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Daniel Little/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testCreateFunc() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://35.242.137.2:8080/workoutTracker-1.0/createUser.html");
		CreateLandingPage laPage = PageFactory.initElements(driver, CreateLandingPage.class);
		Thread.sleep(1000);
		laPage.typeName("xxx", "yyy");
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[5]/button"))).click().perform();
		Thread.sleep(500);
		String confirmed = laPage.confirmationText();
		assertEquals("User successfully created!", confirmed);
	}
}
