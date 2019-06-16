package com.qa.seleniumCRUD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "/html/body/div[1]/h1")
	private WebElement title;
	
	public String findHomePage() {
		return title.getText();
	}
	
}
