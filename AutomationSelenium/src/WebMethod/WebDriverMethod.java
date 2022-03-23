package WebMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.bitsler.com/?source=pwa");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(200);
		
		
		driver.navigate().to("https://accounts.google.com/b/0/AddMailService");
		
		
		
		
		
	}

}
