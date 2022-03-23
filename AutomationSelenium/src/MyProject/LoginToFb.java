package MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFb {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		driver.findElement(By.id("email")).sendKeys("amoljadhao098@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys("Ajadhao093");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Er Amol Jadhao")).click();
		
	}

}
