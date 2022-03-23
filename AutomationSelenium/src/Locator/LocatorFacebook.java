package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorFacebook {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//xpath by diffrant attribute
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("FDfg");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dddddd");
		//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("DDfgfgrg");
		
		
		//xpath by index
		
		//driver.findElement(By.xpath("//a[@class='gb_d'][1]")).click();
		
		
		
		// xpath by text
		//driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		//driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		
		//  xpath by contains
		
		//driver.findElement(By.xpath("//a[contains(text(),'Gm')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Gm')]")).click();

		
		
		
		//driver.findElement(By.id("email")).sendKeys("Ddddfdf");
		//driver.findElement(By.name("email")).sendKeys("fhfhf");
	
		
		
		
		
		
		
		
		
	}

}
