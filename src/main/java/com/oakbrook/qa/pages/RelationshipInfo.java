package com.oakbrook.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.oakbrook.qa.pages.HomePage;
import com.oakbrook.qa.base.TestBase;

public class RelationshipInfo extends TestBase {
	
	@FindBy(xpath="//button[@id='onboardRequestSubmit']")
	WebElement submitButton;
	
	@FindBy(xpath="//span[contains(text(),'Relationship Info')]")
	WebElement RelationshipInfo;
	
	@FindBy(xpath="//input[@id='relName']")
	WebElement RelationshipName;
	
	@FindBy(xpath="//input[@id='relTotalMarketVal']")
	WebElement RelTotalMarketVal;
	
	@FindBy(xpath="//button[@id='saveButton']")
	WebElement saveBtn;
	
	@FindBy(id="nextButton")
	WebElement nextBtn;
	
	//Initialization the Page Objects:
		public RelationshipInfo() {
			PageFactory.initElements(driver, this);
		}
		
		public void clickSubmitButton() {
			submitButton.click();
		}
		
		public String verifyRelationshipPageTitle() {
			return driver.getTitle();
		}
		
		public ClientInfo createNewRelationship (String relname, String reltotalmarketval) {
			RelationshipName.sendKeys(relname);
			RelTotalMarketVal.sendKeys(reltotalmarketval);
			saveBtn.click();
			nextBtn.click();
			
			return new ClientInfo();
		}
		
		
		
}
