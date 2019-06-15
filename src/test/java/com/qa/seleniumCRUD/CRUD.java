package com.qa.seleniumCRUD;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CRUD {

WebDriver driver;
Actions action;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Daniel Little/chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions(driver);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	@Category(Cat1.class)
	public void stage1_TestCreateFunc() {
		driver.get("http://35.242.137.2:8080/workoutTracker-1.0/createUser.html");
		CreateLandingPage laPage = PageFactory.initElements(driver, CreateLandingPage.class);
		laPage.typeName("xxx", "yyy");
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[5]/button"))).click().perform();
		String confirmed = laPage.confirmationText();
		assertEquals("User successfully created!", confirmed);
	}
	
	@Test
	@Category(Cat2.class)
	public void stage2_TestGetFunc() throws InterruptedException {
		driver.get("http://35.242.137.2:8080/workoutTracker-1.0/loginPage.html");
		LoginPage loPage = PageFactory.initElements(driver, LoginPage.class);
		loPage.typeName("xxx", "yyy");
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[5]/button"))).click().perform();
		driver.manage().timeouts().implicitlyWait(1L, TimeUnit.SECONDS);
		
		UserLandingPage usPage = PageFactory.initElements(driver, UserLandingPage.class);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/button[2]"))).click().perform();
		String nameDisplayed = usPage.findDetails();
		
		assertEquals("xxxyyy", nameDisplayed);
	}
}
