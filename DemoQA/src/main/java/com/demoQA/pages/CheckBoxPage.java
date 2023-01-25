package com.demoQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.demoQA.utils.CommonUtils;
import com.demoQA.utils.Waiters;

public class CheckBoxPage {

	WebDriver driver;
	Waiters waiters;
	CommonUtils utils;
	public CheckBoxPage(WebDriver driver){
		this.driver=driver;
		waiters= new Waiters(this.driver);
		utils=new CommonUtils(this.driver);
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='rct-collapse rct-collapse-btn']")
	WebElement expand;
	
	//Desktop::Notes
	//Documents::Office::Private
	public void selectOption(String option){
		String category[]=option.split("::");
        if(!option.equalsIgnoreCase("home")){
            driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
            
            driver.findElement(By.xpath("//span[text()='"+category[0]+"']/parent::label/preceding-sibling::button")).click();

            if(category.length==3){
                utils.scrollIntoView(driver.findElement(By.xpath("//span[text()='"+category[1]+"']/parent::label/preceding-sibling::button")));
                driver.findElement(By.xpath("//span[text()='"+category[1]+"']/parent::label/preceding-sibling::button")).click();
                utils.scrollIntoView(driver.findElement(By.xpath("//span[text()='"+category[2]+"']/parent::label/span[@class='rct-checkbox']")));
                driver.findElement(By.xpath("//span[text()='"+category[2]+"']/parent::label/span[@class='rct-checkbox']")).click();
            }
            else{
            	 utils.scrollIntoView(driver.findElement(By.xpath("//span[text()='"+category[1]+"']/parent::label/span[@class='rct-checkbox']")));
                driver.findElement(By.xpath("//span[text()='"+category[1]+"']/parent::label/span[@class='rct-checkbox']")).click();
            }
        }
	}
}
