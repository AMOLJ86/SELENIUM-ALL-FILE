package Scrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,100)");
		
		driver.findElement(By.linkText("मराठी")).click();
	}

}
