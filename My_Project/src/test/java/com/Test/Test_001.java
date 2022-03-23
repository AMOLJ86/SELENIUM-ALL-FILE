package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.BaseClass;

public class Test_001  extends BaseClass{ 
	@Test
	public void verify_001() {
		
        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("amoljadhao093@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("Ajadhao093");
		
        WebElement btnlogin=driver.findElement(By.name("login"));
		btnlogin.click();
	}
	
	
	
	
	
		
		
	}
	
	


