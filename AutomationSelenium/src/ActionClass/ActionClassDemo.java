package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement a=driver.findElement(By.linkText("Gmail"));
		
		Thread.sleep(2000);
		Actions b=new Actions(driver);
		//b.moveToElement(a).build().perform();// move mouse pointer one position to another position 
		//b.contextClick(a).build().perform();// Right click on particular webelement
		//b.click(a).build().perform();//click on particular WebElement
		
	

	}

}
