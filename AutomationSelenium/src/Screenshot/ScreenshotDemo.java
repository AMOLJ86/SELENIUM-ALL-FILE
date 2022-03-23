package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	
	public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		
     	WebDriver driver = new ChromeDriver();		
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
		
       
        File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File d=new File("D:/sssss.bmp");
        
        FileUtils.copyFile(s, d);
        
        driver.close();
        
        
		

}
}