package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Loginpom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_001  extends BaseClass{ 
	@Test
	public void verify_001() {
		
		
		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
		
		Library.custom_sendkeys(login.getEmail(), "amoljadhao093@gmail.com");
		Library.custom_sendkeys(login.getPassword(), "Ajadhao093");
		Library.custom_click(login.getBtnLogin());
		
		
		
		
		
		
		
		
		
//		login.getEmail().sendKeys("amoljadhao093@gmail.com");
//	    login.getPassword().sendKeys("Ajadhao093");
//		login.getBtnLogin().click();
		
		
		
		
		
//        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
//		email.sendKeys("amoljadhao093@gmail.com");
//		
//		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
//		pass.sendKeys("Ajadhao093");
//		
//        WebElement btnlogin=driver.findElement(By.name("login"));
//		btnlogin.click();
	}
	
	
	
	
	
		
		
	}
	
	


