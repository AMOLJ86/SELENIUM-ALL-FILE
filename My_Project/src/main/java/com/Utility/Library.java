package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Library {
	
	public static void custom_sendkeys(WebElement element, String value) {
		
		try {
			element.sendKeys(value);
			
		}catch(Exception e){
			System.out.println("unable to send value");
			
		}
	}
	
	
    public static void custom_click(WebElement element) {
		
		try {
			element.click();
			
		}catch(Exception e){
			System.out.println("unable to click");
			}
	}
	
    public static void custom_handleDropDwon(WebElement element, String text) {
		
		try {
			Select s=new Select(element);
			s.selectByVisibleText(text);
			
		}catch(Exception e){
			System.out.println("unable to click");
			}
	}
	
	
	

}
