package com.oakbrook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oakbrook.qa.base.TestBase;

public class DefineProspectClient extends TestBase {
	
	@FindBy(xpath="//button[@id='onboardRequestSubmit']")
	WebElement submitButton;
	
	//Initialization the Page Objects:
		public DefineProspectClient() {
			PageFactory.initElements(driver, this);
		}
		
		public RelationshipInfo clickSubmitButton() {
			submitButton.submit();
			return new RelationshipInfo();
		}
}
