package com.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmezonMobileBUy {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();

		
	   driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	   
	
		
		

		Set<String> s= driver.getWindowHandles();//002  001
		System.out.println(s);
		Iterator<String> it = s.iterator();//001 002
		
		it.next();//001
	  	String w2nd = it.next();//002
	  	System.out.println(w2nd);
	    
	           driver.switchTo().window(w2nd);
	           
	           
	           
	        JavascriptExecutor j= (JavascriptExecutor)driver;
	   		j.executeScript("window.scrollBy(0,100)");
	   		
	   		
	   		
	   		driver.findElement(By.id("add-to-cart-button")).click();
	   		
	   		driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
	   	
	   		
	   		
	   		
	           
	   
	   
	   
	}
	

}
