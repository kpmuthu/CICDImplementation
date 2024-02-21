package com.sfCRM.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	private static final Locators NAME = null;

	public HomePage verifyMyHomePage() {

		verifyTitle("Home Page");
		// verifyDisplayed(locateElement(Locators.LINK_TEXT,"Leads"));

		reportStep("Home Page is matching with expected title", "pass");
		return this;
	}

	public AccountPage clickAccount() throws InterruptedException {
		WebElement eleAccount_Tab = locateElement(Locators.LINK_TEXT, "Accounts");

		click(eleAccount_Tab);
		reportStep("Account tab is clicked successfully", "pass");
		return new AccountPage();

	}

	

}
