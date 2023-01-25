package com.demoQA.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.demoQA.driverManager.WebDriverManager;
import com.demoQA.dto.TextBoxJson;
import com.demoQA.pages.*;
import com.demoQA.utils.*;

public class ElementsTest {
	protected WebDriverManager wm=null;
	protected WebDriver driver=null;

	protected HomePage homePage;
	protected TextBoxPage textBoxPage;
	protected CheckBoxPage checkBoxPage;
	protected PageObjectManager pageObjectManager;
	protected TextBoxJson data;

	@BeforeSuite
	public void beforeSuite(){
		wm=new WebDriverManager();
		driver=wm.getDriver();
		pageObjectManager= new PageObjectManager(driver);
		homePage=pageObjectManager.getHomepage();
		textBoxPage=pageObjectManager.getTextBoxPage();
		checkBoxPage=pageObjectManager.getCheckBoxpage();
	}

	@BeforeTest
	public void beforeTest(){
		data=FileReaderManager.getInstance().getJsonReader().getDetails();
	}
	@Parameters({"widgetName","textbox"})
	@Test
	public void tc_textBox(String widgetName,String menuOption){
		homePage.selectWidget(widgetName);
		homePage.selectMenu(menuOption);
		textBoxPage.enterDetails(data);
		textBoxPage.verifyDetails(data);
	}
	@Parameters({"checkbox","options"})
	@Test
	public void tc_checkBox(String menuOption,String options){
		homePage.selectMenu(menuOption);
		checkBoxPage.selectOption(options);
	}

	@AfterSuite
	public void afterSuite(){
		wm.close();
	}
}
