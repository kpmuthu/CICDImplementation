package com.sfCRM.pages;

import java.util.Locale;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.github.javafaker.Faker;

public class AccountPage extends ProjectSpecificMethods {

	private static final Locators NAME = null;

	public AccountPage verifyMyHomePage() {

		verifyTitle("Accounts");
		// verifyDisplayed(locateElement(Locators.LINK_TEXT,"Leads"));

		reportStep("Accounts Page is matching with expected title", "pass");
		return this;
	}

	public AccountPage clickAccount() {
		WebElement eleAccount_Tab = locateElement(Locators.LINK_TEXT, "Accounts");

		click(eleAccount_Tab);
		reportStep("Account tab is clicked successfully", "pass");
		return this;

	}

	public AccountPage clickAccount_New() {
		WebElement eleAccount_New = locateElement(Locators.NAME, "new");

		click(eleAccount_New);
		reportStep("New button is clicked successfully", "pass");
		return this;

	}

	public AccountPage enterAccountName() {
		WebElement eleAccountName = locateElement("acc2");
		String Account_Name = fake.name().fullName();
		clearAndType(eleAccountName, "Petchi-"+Account_Name);
		reportStep("Account Name " + Account_Name + " is entered successfully", "pass");
		return this;
	}

	public AccountPage selectType() {
		WebElement eleType = locateElement("acc6");
		selectDropDownUsingText(eleType, "Installation Partner");
		reportStep("Type dropdown value is entered successfully", "pass");
		return this;
	}

	public AccountPage enterPhone() {
		WebElement eleAccountName = locateElement("acc10");
		String cellPhone = fake.phoneNumber().cellPhone();
		clearAndType(eleAccountName, cellPhone);
		reportStep("Phone value is entered successfully", "pass");
		return this;
	}

	public AccountPage enterActive() throws InterruptedException {
		WebElement eleActvie = locateElement(Locators.XPATH, "//td[contains(@class,'dataCol last')]//select[1]");
		selectDropDownUsingText(eleActvie, "Yes");
		Thread.sleep(5000);
		reportStep("Active dropdown value is entered successfully", "pass");
		return this;

	}

	public HomePage clickSave() throws InterruptedException {
		WebElement eleSave = locateElement(Locators.XPATH, "(//input[@value=' Save '])[2]");

		click(eleSave);
		reportStep("Save button is clicked successfully", "pass");
		return new HomePage();

	}

}
