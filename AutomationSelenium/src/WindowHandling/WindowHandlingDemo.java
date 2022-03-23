package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		Iterator<String> it=s.iterator();
		
		
		it.next();
		String w2nd=it.next();
		String w1nd=it.next();
	 	System.out.println(w2nd);
		driver.switchTo().window(w2nd);
		
		driver.findElement(By.name("emailid")).sendKeys("amoljadhao093@gmail.com");
		
		driver.findElement(By.name("btnLogin")).click();

		driver.switchTo().window(w1nd);
		
		
	}

}
