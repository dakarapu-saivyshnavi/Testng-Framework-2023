package com.demoQA.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.Parser;

public class Waiters {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public Waiters(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(this.driver, Integer.parseInt(FileReaderManager.getInstance().getConfigReader().getExplicitWait()));
	}
	
	public void waitForElement(By locator){
		 wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void waitForElement(WebElement we){
		 wait.until(ExpectedConditions.visibilityOf(we));
	}

	
}
