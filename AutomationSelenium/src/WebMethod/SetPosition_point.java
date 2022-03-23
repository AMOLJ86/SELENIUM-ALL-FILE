package WebMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_point {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.bitsler.com/?source=pwa");
		
		Point p=new Point(500,0);
		driver.manage().window().setPosition(p);
		

		
	}
}
