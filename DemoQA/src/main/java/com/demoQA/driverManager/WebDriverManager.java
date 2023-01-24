package com.demoQA.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demoQA.utils.FileReaderManager;

public class WebDriverManager {
	
	private WebDriver driver;
	private static String browser;
	private static String app;
	private static String explicitWait;
	private static String driverPath;
	
	public WebDriverManager(){
		browser=FileReaderManager.getInstance().getConfigReader().getBrowser();
		driverPath=FileReaderManager.getInstance().getConfigReader().getDriverpath();
	}
	
	public WebDriver getDriver(){
			return (driver==null) ? createDriver() : driver;
	}
	
	private WebDriver createDriver(){
		if(browser.equalsIgnoreCase("chrome")){
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(FileReaderManager.getInstance().getConfigReader().getAppUrl());
		return driver;
	}
	
	public void close(){
		driver.close();
		driver.quit();
	}

}
