package com.demoQA.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.demoQA.dto.TextBoxJson;
import com.demoQA.utils.CommonUtils;
import com.demoQA.utils.Waiters;

public class TextBoxPage {
	protected WebDriver driver;
	protected Waiters waiters;
	protected CommonUtils utils;
	
	public TextBoxPage(WebDriver driver){
		this.driver=driver;
		waiters= new Waiters(this.driver);
		utils=new CommonUtils(this.driver);
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
	
	@FindBy(how=How.ID, using="name")
	WebElement name;
	
	@FindBy(how=How.ID, using="email")
	WebElement emailValue;
	
	@FindBy(how=How.XPATH, using="//p[@id='currentAddress']")
	WebElement currentAddressValue;
	
	@FindBy(how=How.XPATH, using="//p[@id='permanentAddress']")
	WebElement permanentAddressValue;
	
	
	
	public void enterDetails(TextBoxJson data){
		firstName.sendKeys(data.fullName);
		email.sendKeys(data.email);
		currentAddress.sendKeys(data.currentAddress);
		utils.scrollIntoView(submit);
		permanentAddress.sendKeys(data.permenantAddress);
		submit.click();
	}
	
	
	public void verifyDetails(TextBoxJson data){
		utils.scrollIntoView(name);
		Assert.assertEquals(data.fullName, name.getText().split(":")[1]);
		Assert.assertEquals(data.email, emailValue.getText().split(":")[1]);
		String s=currentAddressValue.getText();
		
		Assert.assertEquals(data.currentAddress, currentAddressValue.getText().split(":")[1].trim());
		Assert.assertEquals(data.permenantAddress, permanentAddressValue.getText().split(":")[1]);
	}

}
