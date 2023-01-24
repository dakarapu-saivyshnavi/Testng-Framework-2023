package com.demoQA.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.demoQA.dto.TextBoxJson;

public class TextBoxPage {
	WebDriver driver;
	JavascriptExecutor js =null;
	public TextBoxPage(WebDriver driver){
		this.driver=driver;
		js= (JavascriptExecutor) driver;;
	}
	
	@FindBy(how= How.ID, using="userName")
	WebElement firstName;
	
	@FindBy(how=How.ID, using="userEmail")
	WebElement email;
	
	@FindBy(how=How.ID, using="currentAddress")
	WebElement currentAddress;
	
	@FindBy(how=How.ID, using="permanentAddress")
	WebElement permanentAddress;
	
	@FindBy(how=How.ID, using="submit")
	WebElement submit;
	
	
	
	public void enterDetails(TextBoxJson data){
		firstName.sendKeys(data.fullName);
		email.sendKeys(data.email);
		currentAddress.sendKeys(data.currentAddress);
		//scroll element
		permanentAddress.sendKeys(data.permenantAddress);
		submit.click();
	}
	

}
