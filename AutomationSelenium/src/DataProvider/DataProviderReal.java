package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderReal {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:/Software/chrome/chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	}

	@DataProvider(name="TestData1")
	public Object[][] grtData(){
		
		Object[][] Data=new Object[2][2];
		//pass Test case
		Data[0][0]="amoljadhao094@gmail.com";
		Data[0][1]="Ajadhao093";
		
		//fail Testg case
		
		Data[1][0]="amoljadhao093@gmai";
		Data[1][1]="ajadhao093";
		return Data;
		
		
	}
	
	@Test(dataProvider="TestData1")
	public void login(String username,String password) throws InterruptedException {
		
		

		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();

//		driver.close();

		
	}
	
	
	
}
