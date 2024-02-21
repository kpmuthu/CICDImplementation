package com.sfCRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUsername(String uName) {
		// step1: locate the element
		WebElement eleUsername = locateElement("username");
		
		// step2: interact with the weblement
		clearAndType(eleUsername, uName);
		
		reportStep(uName+" username is entered successfully", "pass");
		
		return this;
	}

	public LoginPage enterPassword(String passWord) {

		// step1: locate the element
		WebElement elePassword = locateElement("password");

		// step2: interact with the weblement
		clearAndType(elePassword, passWord);
		
		reportStep(passWord+" password is entered successfully", "pass");
		
		return this;

	}

	public HomePage clickLogin() throws InterruptedException {
		WebElement eleLogin = locateElement("Login");
		
		click(eleLogin);
		Thread.sleep(6000);
		reportStep("Login button is clicked successfully", "pass");
		return new HomePage();

	}

}
