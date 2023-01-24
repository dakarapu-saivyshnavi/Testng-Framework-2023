package com.demoQA.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.demoQA.driverManager.WebDriverManager;
import com.demoQA.dto.TextBoxJson;
import com.demoQA.pages.HomePage;
import com.demoQA.pages.TextBoxPage;
import com.demoQA.utils.FileReaderManager;
import com.demoQA.utils.PageObjectManager;

public class SampleTest {
	public WebDriverManager wm;
	public static WebDriver driver;
	public PageObjectManager pageObjectManager;
	HomePage hp;
	TextBoxPage tp;
	
	@Test
	public void textBox(){
		
		TextBoxJson data=FileReaderManager.getInstance().getJsonReader().getDetails();
	    wm=new WebDriverManager();
		driver=wm.getDriver();
		pageObjectManager=new PageObjectManager(driver);
		hp=pageObjectManager.getHomepage();
		hp.selectWidget("Elements");
		hp.selectMenu("Text Box");
		tp=pageObjectManager.getTextBoxPage();
		tp.enterDetails(data);
		wm.close();
	
	}
	
	@Test
	public void checckBox(){
		
	}

}
