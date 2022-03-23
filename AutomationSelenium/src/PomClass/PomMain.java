package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomMain {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		
     	WebDriver driver = new ChromeDriver();	
     	driver.manage().window().maximize();
     	driver.get("https://www.google.com/");
     	Thread.sleep(2000);
     	
     	PomDemo1 pom1=new PomDemo1(driver);
     	pom1.search();
     	
     	PomDemo2 pom2=new PomDemo2(driver);
     	pom2.enter();
	}

}
