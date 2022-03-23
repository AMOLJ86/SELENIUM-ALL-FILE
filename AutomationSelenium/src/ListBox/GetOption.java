package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		
     	WebDriver driver = new ChromeDriver();		
        driver.get("https://techcanvass.com/Examples/multi-select.html");
        driver.manage().window().maximize();
        
        WebElement listbox=driver.findElement(By.id("multiselect"));
        Select s=new Select(listbox);
        
       List<WebElement> b= s.getOptions();
       int c=b.size();
       System.out.println(c);
      
       
       for(int i=0; i<c; i++) {
    	   
    	   String z=b.get(i).getText();
    	   System.out.println(z);
    	   Thread.sleep(2000);
       }
        
		
	}
}
