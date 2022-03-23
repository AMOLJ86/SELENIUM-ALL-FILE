package TestNGHardAndSoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HardTest1 {
  @Test
  public void verifyTitle() {
	  System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		
		System.out.println("Test case exicution start");
		String CurrentTitle=driver.getTitle();
		System.out.println(CurrentTitle);
		
		
		Assert.assertEquals("google","google1");
		
		System.out.println("Test case exicution end");
	    driver.close();
  }
}
