package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		
     	WebDriver driver = new ChromeDriver();	
     	
        driver.get("https://techcanvass.com/Examples/multi-select.html");
        driver.manage().window().maximize();
        
       WebElement listbox= driver.findElement(By.id("multiselect"));
       Select s=new Select(listbox);
       
       
       //GetFirstSelectedoptin()
//       s.selectByIndex(1);
//   
//       WebElement a=s.getFirstSelectedOption();
//       String c=a.getText();
//       System.out.println(c);
       
       
       //isMultiple()
       //s.selectByIndex(1);
       //s.selectByIndex(2);
      // s.selectByIndex(4);
       
      boolean sm= s.isMultiple();
      System.out.println(sm);
     
       
	}
	
	

}
