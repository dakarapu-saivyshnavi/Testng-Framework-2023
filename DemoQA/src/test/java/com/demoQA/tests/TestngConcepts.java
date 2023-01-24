package com.demoQA.tests;

import org.testng.annotations.*;

public class TestngConcepts {
	@BeforeSuite
	public void bs(){
		System.out.println("This is before suite method");
	}
	@AfterSuite
	public void as1(){
		System.out.println("This is after suite method");
	}
	@BeforeClass
	public void bc(){
		System.out.println("This is before class method");
	}
	@AfterClass
	public void ac(){
		System.out.println("This is after class method");
	}
	
	/*
	@BeforeMethod
	public void bm(){
		System.out.println("This is before method");
	}
	@AfterMethod
	public void am(){
		System.out.println("This is after method");
	}*/

	@BeforeTest
	public void bt(){
		 System.out.println("This is before test method");
	}
	@Parameters({"fullName","email"})
    @Test(dependsOnMethods="abc", groups={"smoke"})
    public void xyz(String name,String email) {
	  System.out.println("This is xyz method "+name +" "+email);
    }
	
    @Test(dependsOnMethods="xyz",groups={"smoke","regression"})
    public void def() {
	  System.out.println("This is def method");
    }
	
    @Test(groups={"smoke"})
    public void abc() {
	  System.out.println("This is abc method");
    }
   
    @Test(groups={"regression"})
    public void opq() {
	  System.out.println("This is opq method");
    }
    
    @Test(groups={"smoke","regression"})
    public void ghi() {
	  System.out.println("This is ghi method");
    }
    
    @Test(groups={"regression"})
    public void ijk() {
	  System.out.println("This is ijk method");
    }
    
    @Test(groups={"regression"})
    public void lmn() {
	  System.out.println("This is lmn method");
    }
    @AfterTest
	public void at(){
		 System.out.println("This is after test method");
	}

}
