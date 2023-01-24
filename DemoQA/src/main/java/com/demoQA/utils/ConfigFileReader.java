package com.demoQA.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.demoQA.enums.Environment;

public class ConfigFileReader {

	private Properties props;
	private final String propertyFilePath="D:\\TestNg_Selenium\\TestNG_Framework\\DemoQA\\src\\main\\resources\\Application\\config.properties";

	public  ConfigFileReader(){
		try {
			FileInputStream fi=new FileInputStream(propertyFilePath);
			props=new Properties();

			try {
				props.load(fi);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try {
					fi.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getDriverpath(){

		String driverPath=props.getProperty("driverpath");
		if(driverPath!=null)
			return driverPath;
		else 
			throw new RuntimeException("Driverpath is not found at "+propertyFilePath);
	}
	public String getAppUrl(){

		String app=props.getProperty("applicationurl");
		if(app!=null)
			return app;
		else 
			throw new RuntimeException("Application URL is not found at "+propertyFilePath);
	}
	public String getBrowser(){

		String browser=props.getProperty("browser");
		if(browser!=null)
			return browser;
		else 
			throw new RuntimeException("Browser is not found at "+propertyFilePath);
	}
	public String getTestDatapath(){

		String testDatapath=props.getProperty("testdatapath");
		if(testDatapath!=null)
			return testDatapath;
		else 
			throw new RuntimeException("TestData path is not found at "+propertyFilePath);
	}

	public String getExplicitWait(){

		String explicitwait=props.getProperty("explicitwait");
		if(explicitwait!=null)
			return explicitwait;
		else 
			throw new RuntimeException("Wait tile is not found at "+propertyFilePath);
	}
	
}
