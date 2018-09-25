package com.oakbrook.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.oakbrook.qa.base.TestBase;
import com.oakbrook.qa.pages.DefineProspectClient;
import com.oakbrook.qa.pages.HomePage;
import com.oakbrook.qa.pages.LoginPage;
import com.oakbrook.qa.pages.RelationshipInfo;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	RelationshipInfo relationshipInfo;
		
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Dashboard - WWX", "Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		homePage.verifyCorrectUserName();
	}
	
	@Test(priority=3)
	public void clickAddNew() {
		homePage.clickAddNewlink();
	}
	
	@AfterMethod 
	public void tearDown() {
		driver.quit();
	}
}
