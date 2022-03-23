package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		
     	WebDriver driver = new ChromeDriver();		
        driver.get("https://techcanvass.com/Examples/multi-select.html");
        driver.manage().window().maximize();
        
        WebElement listbox=driver.findElement(By.id("multiselect"));
        
        Select a=new Select(listbox);
        
//        a.selectByIndex(3);
//        Thread.sleep(2000);
//        a.deselectByIndex(1);
//        
        
        a.selectByVisibleText("Honda");
        Thread.sleep(2000);
        a.deselectByVisibleText("Honda");
        
//        
//        
//        a.selectByValue("hyundai");
//        Thread.sleep(2000);
//        a.deselectByValue("hyundai");
        
        
        
        driver.close();
//        a.selectByIndex(3);
//        a.selectByIndex(2);
//        a.selectByIndex(0);
        
       // Thread.sleep(2000);
        
//          a.selectByVisibleText("Audi");
//          a.selectByVisibleText("Honda");

        
		
	}
}

