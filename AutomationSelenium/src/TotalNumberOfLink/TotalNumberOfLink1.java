package TotalNumberOfLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNumberOfLink1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> a=driver.findElements(By.tagName("a"));
		
		System.out.println("Total Number of link :: "+a.size());
		
		for(int i=0; i<a.size(); i++) {
			
			String abc=a.get(i).getText();
			System.out.println(abc);
			//Thread.sleep(1000);
		}
		
		



}
}