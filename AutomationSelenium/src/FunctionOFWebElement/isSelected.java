package FunctionOFWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-7-2"));
        Thread.sleep(2000);
        
        boolean abc = driver.findElement(By.id("vfb-7-2")).isSelected();
        System.out.println(abc);
       driver.close();
}
}