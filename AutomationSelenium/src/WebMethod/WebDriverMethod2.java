package WebMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
	
		driver.getTitle();
		String title=driver.getTitle();
		System.out.println("Title of page :: "+title);
		
		driver.getCurrentUrl();
		String url=driver.getCurrentUrl();
		System.out.println("url is :: "+url);
		
		driver.close();
		
		
		
		
		
		
	}

}
