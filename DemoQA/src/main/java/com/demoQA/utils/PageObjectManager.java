package com.demoQA.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.demoQA.pages.HomePage;
import com.demoQA.pages.TextBoxPage;

public class PageObjectManager {
	private WebDriver driver;
	
	private HomePage hp;
	
	private TextBoxPage textboxpage;
	
	public PageObjectManager(WebDriver driver){
		this.driver=driver;
	}

	public HomePage getHomepage(){
		return(hp==null) ? ( hp =PageFactory.initElements(driver, HomePage.class)):hp;
	}
	public TextBoxPage getTextBoxPage(){
		return(textboxpage==null) ? (textboxpage = PageFactory.initElements(driver, TextBoxPage.class)):textboxpage;
	}
}
