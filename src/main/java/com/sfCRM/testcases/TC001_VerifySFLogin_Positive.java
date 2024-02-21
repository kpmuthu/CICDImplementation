package com.sfCRM.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.sfCRM.pages.LoginPage;

public class TC001_VerifySFLogin_Positive extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "Verify Salesforce-CRM Login";
		testDescription ="Verify Salesforce-CRM Login with positive credential";
		authors="Arief";
		category ="Smoke";
		excelFileName="Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin();

	}

}
