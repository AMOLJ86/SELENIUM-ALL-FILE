package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDemo {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		
     	WebDriver driver = new ChromeDriver();	
     	driver.manage().window().maximize();
     	
     	driver.get("https://www.google.com/");
     	Thread.sleep(2000);
     	
     	driver.findElement(By.name("q")).sendKeys("Redmi note 5");
     	
     	List<WebElement> a=driver.findElements(By.tagName("li"));
     	int size=a.size();
     	System.out.println(size);
     	
     	for(int i=0; i<=size-1; i++) {
     	String amol=a.get(i).getText();
     	System.out.println(amol);
     	//Thread.sleep(1000);
     	}
     	
     	
     	

	}

}
