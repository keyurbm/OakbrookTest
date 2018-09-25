package com.oakbrook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oakbrook.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//@FindBy(xpath="//a[contains(text(),'Robert Johnson')]")
	//WebElement UserNameLabel;

	@FindBy(xpath="//a[contains(text(),'Advisor Admin')]")
	WebElement UserNameLabel;
		
	@FindBy(xpath="//a[@class='page-scroll'][contains(text(),'Dashboard')]")
	WebElement Dashboard;
	
	@FindBy(xpath="//a[contains(text(),'My Tasks')]")
	WebElement MyTasks;
	
	@FindBy(xpath="//button[@title='Add new account']")
	WebElement AddNewAcc;
	
	@FindBy(xpath="//button[@id='onboardRequestSubmit']")
	WebElement submitButton;
		
	//Initialization the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return UserNameLabel.isDisplayed();
	}
	
	public RelationshipInfo clickAddNewlink() {
		AddNewAcc.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		submitButton.click();
		return new RelationshipInfo();
	}
		
}
