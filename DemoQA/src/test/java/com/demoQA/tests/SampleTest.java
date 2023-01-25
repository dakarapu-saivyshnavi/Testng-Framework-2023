package com.demoQA.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.demoQA.driverManager.WebDriverManager;
import com.demoQA.dto.TextBoxJson;
import com.demoQA.pages.CheckBoxPage;
import com.demoQA.pages.HomePage;
import com.demoQA.pages.TextBoxPage;
import com.demoQA.utils.CommonUtils;
import com.demoQA.utils.FileReaderManager;
import com.demoQA.utils.PageObjectManager;
import com.demoQA.utils.Waiters;

public class SampleTest {
	public WebDriverManager wm;
	public static WebDriver driver;
	public PageObjectManager pageObjectManager;
	HomePage hp;
	CheckBoxPage cp;
	TextBoxPage tp;
	TextBoxJson data;
	Waiters waiters;
	CommonUtils utils;
	@BeforeSuite
	public void beforeSuite(){
		wm=new WebDriverManager();
		driver=wm.getDriver();
		pageObjectManager=new PageObjectManager(driver);
		waiters= new Waiters(driver);
		utils=new CommonUtils(driver);
		hp=pageObjectManager.getHomepage();
		tp=pageObjectManager.getTextBoxPage();
	}
	@BeforeMethod
	public void beforeMethod(){
		 data=FileReaderManager.getInstance().getJsonReader().getDetails();
	}
	@Test
	public void textBox(){
		hp.selectWidget("Elements");
		hp.selectMenu("Text Box");
		
		tp.enterDetails(data);
		wm.close();
	
	}
	@Parameters({"option"})
	@Test
	public void checkBox(String option){
		hp.selectMenu("Check Box");
		cp.selectOption("Documents::Office::Private");
	}

}
