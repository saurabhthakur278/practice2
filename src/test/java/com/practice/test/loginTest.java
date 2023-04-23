package com.practice.test;

import org.testng.annotations.Test;

import com.practice.pages.loginPage;

public class loginTest
{
	
	loginPage lp=new loginPage();
	@Test(priority = 1)
	public void login() 
	{
		lp.setup();
	}
	@Test(priority = 2)
     public void credantial() {
    	 lp.log("Admin", "admin123");
     }
}
