package com.qa.seleniumCRUD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath="//*[@id=\"input1\"]")
	private WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"input2\"]")
	private WebElement lastName;
	
	public void typeName(String fName, String lName) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
	}
	
}
