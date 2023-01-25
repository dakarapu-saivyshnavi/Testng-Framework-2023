package com.demoQA.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonUtils {
	
	WebDriver driver;
	JavascriptExecutor js =null;
	Actions act=null;
	public CommonUtils(WebDriver driver){
		this.driver=driver;
		js= (JavascriptExecutor) driver;;
		act=new Actions(driver);
	}
	
	public void scrollToElement(WebElement we){
	  act.moveToElement(we).build().perform();
	}
	
	public void scrollIntoView(WebElement we){
		js.executeScript("arguments[0].scrollIntoView(true)", we);
	}
	

}
