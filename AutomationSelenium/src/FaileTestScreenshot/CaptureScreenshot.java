package FaileTestScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CaptureScreenshot extends MainTest{
	@Test
	public void captureScreenshot() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		String title=driver.getTitle();
		
		Assert.assertEquals("Home", title);
	
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
		

}
