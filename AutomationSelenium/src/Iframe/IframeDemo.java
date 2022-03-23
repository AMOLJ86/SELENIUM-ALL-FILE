package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver","D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
//		driver.switchTo().frame(0);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("org.openqa.selenium")).click();
//		
//		//driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
		
		
		driver.switchTo().frame("packageFrame");
		Thread.sleep(2000);
		driver.findElement(By.linkText("AbstractAnnotations")).click();
		//driver.close();
	}

}
