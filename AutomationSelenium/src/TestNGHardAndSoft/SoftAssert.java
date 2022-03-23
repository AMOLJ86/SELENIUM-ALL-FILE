package TestNGHardAndSoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {
  @Test
  public void softTest1() {
	  System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		SoftAssert s=new SoftAssert();
		
		System.out.println("Test case exicution start");
		String CurrentTitle=driver.getTitle();
		System.out.println(CurrentTitle);
		
	
  }
}
