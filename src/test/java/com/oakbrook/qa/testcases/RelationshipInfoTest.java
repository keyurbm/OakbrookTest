package com.oakbrook.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.oakbrook.qa.base.TestBase;
import com.oakbrook.qa.pages.ClientInfo;
import com.oakbrook.qa.pages.HomePage;
import com.oakbrook.qa.pages.LoginPage;
import com.oakbrook.qa.pages.RelationshipInfo;

public class RelationshipInfoTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	RelationshipInfo relationshipInfo;
	ClientInfo clientInfo;

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"),
				prop.getProperty("password"));
		homePage.clickAddNewlink();

	}

	@Test(priority=1)
	public void relInfoPageTitleTest(){
		String relPageTitle = relationshipInfo.verifyRelationshipPageTitle();
		Assert.assertEquals(relPageTitle, "Dashboard - WWX");
	}
	
	@Test(priority = 2)
	public void validateRelationshipInfo(String relname,String reltotalmarketval) {
		relationshipInfo.createNewRelationship("James Bond", "100000");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
