package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpom {
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement btnLogin;
	

	public WebElement getEmail() {
		return email;
	}

	

	public WebElement getPassword() {
		return password;
	}

	

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	

}
