package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demmo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		
		driver.get("http://demo.guru99.com/popup.php ");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		
		
		Set<String> s= driver.getWindowHandles();//002  001
		System.out.println(s);
		Iterator<String> it = s.iterator();//001 002
		
		it.next();//001
	  	String w2nd = it.next();//002
	  	System.out.println(w2nd);
	    
	           driver.switchTo().window(w2nd);
	    
	    
	    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
	    
	    
	    driver.findElement(By.name("btnLogin")).click();
	    
	    
	    driver.findElement(By.linkText("Click Here")).click();
	
		

		
	}

	}


