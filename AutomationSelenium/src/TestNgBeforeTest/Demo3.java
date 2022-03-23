package TestNgBeforeTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
	
	@BeforeTest
	public void Login() {
		System.out.println("login = AfterTest");
	}
	
	@AfterTest
	public void Logout() {
		System.out.println("logout=BeforeTest");
	}
	
	@Test
	public void verifyTitle() {
		System.out.println("Verify Title Method");
	}
}
