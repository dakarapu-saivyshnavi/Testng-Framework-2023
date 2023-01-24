package com.demoQA.tests;

import org.testng.annotations.*;

public class TestngConcepts2 {
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
	
	
	@BeforeMethod
	public void bm(){
		System.out.println("This is before method");
	}
	@AfterMethod
	public void am(){
		System.out.println("This is after method");
	}

	@BeforeTest
	public void bt(){
		 System.out.println("This is before test method");
	}
	
    @Test
    public void f() {
	  System.out.println("This is test1 method");
    }
    @Test
    public void f1() {
	  System.out.println("This is test2 method");
    }
    
    @AfterTest
	public void at(){
		 System.out.println("This is after test method");
	}

}
