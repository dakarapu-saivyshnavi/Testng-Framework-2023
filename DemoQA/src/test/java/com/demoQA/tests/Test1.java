package com.demoQA.tests;

import org.openqa.selenium.WebDriver;

import com.demoQA.driverManager.WebDriverManager;
import com.demoQA.pages.HomePage;
import com.demoQA.pages.TextBoxPage;
import com.demoQA.utils.PageObjectManager;

public class Test1 {
	public WebDriverManager wm;
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager wm=new WebDriverManager();
		driver=wm.getDriver();
		PageObjectManager pageObjectManager=new PageObjectManager(driver);
		HomePage hp=pageObjectManager.getHomepage();
		hp.selectWidget("");
		hp.selectMenu("");
		TextBoxPage tp=pageObjectManager.getTextBoxPage();
		//tp.enterDetails();
		
	}

}
