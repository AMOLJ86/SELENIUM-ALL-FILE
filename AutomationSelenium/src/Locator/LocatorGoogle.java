package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorGoogle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//X path by attribut
		
		driver.findElement(By.xpath("//a[@class=\"gb_d\"]")).click();
		
		
		
		
		//driver.findElement(By.className("gb_d")).click();
		
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Image")).click();
		//driver.findElement(By.partialLinkText("Gma")).click();
		
	}
	

}
