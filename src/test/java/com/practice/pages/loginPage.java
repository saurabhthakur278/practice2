package com.practice.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.practice.util.ReusedFunction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPage {
	private By uname=By.xpath("//input[@id='txtUsername']");
	private By pass=By.xpath("//input[@id='txtPassword']");
	private By login=By.xpath("//input[@id='btnLogin']");
	
	WebDriver driver=null;
	
	ReusedFunction util=new ReusedFunction();
	
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void log(String un, String pas) 
	{
		util.elementsend(uname, un, driver);
		util.elementsend(pass, pas, driver);
		util.elementclick(login, driver);
	}


}
