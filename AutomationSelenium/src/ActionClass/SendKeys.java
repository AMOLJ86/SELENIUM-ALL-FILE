package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement a=driver.findElement(By.id("searchDropdownBox"));
		a.click();
		
		Actions b=new Actions(driver);

		
		for(int i=0; i<=10; i++) {
		b.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		}
		
		for(int i=0;i<=10; i++) {
			b.sendKeys(Keys.ARROW_UP).build().perform();
			Thread.sleep(1000);
		}
//		b.sendKeys(Keys.ENTER).build().perform();
//		
//		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();
		
		
	}

}
