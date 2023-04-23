package com.practice.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReusedFunction
{
public void elementclick(By element, WebDriver driver) {
	driver.findElement(element).click();
}
public void elementsend(By element, String text, WebDriver driver) {
	
	driver.findElement(element).sendKeys(text);
}



}
