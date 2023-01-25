package com.demoQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.demoQA.utils.CommonUtils;
import com.demoQA.utils.Waiters;

public class HomePage {
	WebDriver driver;
	Waiters waiters;
	CommonUtils utils;
	public HomePage(WebDriver driver){
		this.driver=driver;
		waiters= new Waiters(this.driver);
		utils=new CommonUtils(this.driver);
	}
	
	String widgetpath="//div[@class='category-cards']";
	
	
	public void selectWidget(String widgetName){
		try {
            utils.scrollIntoView(driver.findElement(By.xpath(widgetpath+"//h5[text()='"+widgetName+"']")));
            waiters.waitForElement(By.xpath("//div[@class='category-cards']//h5[text()='" + widgetName + "']"));
            driver.findElement(By.xpath(widgetpath+"//h5[text()='"+widgetName+"']")).click();
        }catch(Exception e){e.printStackTrace();}
	}
	public void selectMenu(String menuOption){
		utils.scrollIntoView(driver.findElement(By.xpath("//span[text()='"+menuOption+"']")));
		waiters.waitForElement(driver.findElement(By.xpath("//span[text()='"+menuOption+"']")));
		
	        driver.findElement(By.xpath("//span[text()='"+menuOption+"']")).click();
	}

	
	
}
