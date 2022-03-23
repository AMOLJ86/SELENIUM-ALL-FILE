package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforAndAfterMethod {
	
	@BeforeMethod       // Before Method is exicute Before each method
	public void Precondition() {
//		System.out.println("opewn Browser");
//		System.out.println("Enter UserName and Password");
//		System.out.println("Login Successfully");
		Assert.assertEquals("amol", "amoll"); // if Before Method will fail so, atomatically stop the exicution
	}
		
	
	@Test
	public void AddProduct() {
		System.out.println("Add Product Successfully");
	}

	@AfterMethod           // Aftre method is exicute After each method
	public void Logout() {
		System.out.println("Logout successfully");
	}
}
