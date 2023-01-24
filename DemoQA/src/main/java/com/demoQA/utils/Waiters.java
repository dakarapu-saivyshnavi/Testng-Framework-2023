package com.demoQA.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.Parser;

public class Waiters {
	WebDriver driver;
	WebDriverWait wait;
	public Waiters(){
		wait=new WebDriverWait(driver, Integer.parseInt(FileReaderManager.getInstance().getConfigReader().getExplicitWait()));
	}

}
