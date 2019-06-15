package com.qa.seleniumCreate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLandingPage {

	@FindBy(id="success")
	private WebElement confirmation;
	
	@FindBy(xpath = "//*[@id=\"input1\"]")
	private WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"input2\"]")
	private WebElement lastName;
	
	public void typeName(String fName, String lName) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
	}
	
	public String confirmationText() {
		return confirmation.getText();
	}
	
}
