package DataDriven;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class DataDrivenDemo {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
        System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
		
     	WebDriver driver = new ChromeDriver();	
     	driver.manage().window().maximize();
     	driver.get("https://www.facebook.com/");
     	Thread.sleep(2000);
     	
     	FileInputStream excel=new FileInputStream("C:/Users/Amol/Desktop/DataDriven.xlsx");
     	
     	Sheet a=WorkbookFactory.create(excel).getSheet("Sheet1");
     	
     	String b=a.getRow(4).getCell(0).getStringCellValue();
     	String c=a.getRow(3).getCell(0).getStringCellValue();
     	
     	driver.findElement(By.name("email")).sendKeys(b);
     	Thread.sleep(2000);
     	
     	driver.findElement(By.id("pass")).sendKeys(c);
     	Thread.sleep(2000);
     	
     	driver.findElement(By.name("login")).click();
     	
	}

}
