package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomDemo2 {
	
	@FindBy(xpath="//a[@class='gb_d'][1]")  
	private WebElement GMAIL;
	
	
	
	public PomDemo2(WebDriver driver) { //contruction
		
		PageFactory.initElements(driver, this);
		
	}

	public void enter() {
		GMAIL.click();
	}
	
}
