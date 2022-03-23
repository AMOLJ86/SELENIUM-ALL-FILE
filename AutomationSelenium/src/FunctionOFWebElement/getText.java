package FunctionOFWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//getText()
		
//		String a=driver.findElement(By.linkText("Gmail")).getText();
//		System.out.println(a);
//		driver.findElement(By.linkText("Gmail")).getText();
		
		//isEnabled() function
		
		boolean a=driver.findElement(By.linkText("Gmail")).isEnabled();
		System.out.println(a);
	
		
		// isSelected() function
		
		
		
	}

}
