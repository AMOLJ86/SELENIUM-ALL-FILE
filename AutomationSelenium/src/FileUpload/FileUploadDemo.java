package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		
		WebElement Upload=driver.findElement(By.id("uploadfile_0"));
		
		Upload.sendKeys("D:/RANJIT JADHAO/_DSC3218.JPG");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);
		
		driver.close();

	}

}
