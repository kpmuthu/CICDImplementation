package com.sfCRM.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.sfCRM.pages.LoginPage;

public class TC002_VerifyAccountCreation extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "Verify Account Creation";
		testDescription ="Verify Salesforce-CRM Account creation-basic fields";
		authors="Arief";
		category ="functionality";
		excelFileName="Account-Create";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickAccount()
		.clickAccount_New()
		.enterAccountName()
		.selectType()
		.enterPhone()
		.enterActive()
		.clickSave();

	}

}
