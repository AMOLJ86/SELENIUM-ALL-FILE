package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(3);
		
		driver.findElement(By.linkText("WebElement")).click();
		
		
		
	}

}
