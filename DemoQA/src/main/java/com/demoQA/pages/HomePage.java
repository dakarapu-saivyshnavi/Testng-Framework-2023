package com.demoQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	JavascriptExecutor js =null;
	public HomePage(WebDriver driver){
		this.driver=driver;
		js= (JavascriptExecutor) driver;;
	}
	
	String widgetpath="//div[@class='category-cards']";
	
	
	public void selectWidget(String widgetName){
		try {
            js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath(widgetpath+"//h5[text()='"+widgetName+"']")));
           // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='category-cards']//h5[text()='" + concept + "']")));
            driver.findElement(By.xpath(widgetpath+"//h5[text()='"+widgetName+"']")).click();
        }catch(Exception e){e.printStackTrace();}
	}
	public void selectMenu(String menuOption){
		// wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='"+option+"']"))));
	        js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//span[text()='"+menuOption+"']")));
	        driver.findElement(By.xpath("//span[text()='"+menuOption+"']")).click();
	}

	
	
}
