package WebMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_Dimension {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.bitsler.com/?source=pwa");
		
		Point p=new Point(1000,0);
		driver.manage().window().setPosition(p);
	

		
		Dimension a=new Dimension(500,800);
		driver.manage().window().setSize(a);
		
	}

}
