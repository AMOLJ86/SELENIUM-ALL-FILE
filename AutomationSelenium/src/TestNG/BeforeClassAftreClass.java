package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAftreClass {
	
	
	@BeforeClass  // this method is exicute one time Before the class
	public void Login() {
		System.out.println("Login Successfully");
	}

	@AfterClass    // this method is exicute one time After the class
	public void Logout() {
		System.out.println("logout Successfully");
	}
	
	@Test(priority=1)
	public void addProduct() {
		System.out.println("Add product in card");
		
	}
	
	@Test(priority=3)
	public void addVendar() {
		
		System.out.println("add vendar Successfully");
		
	}
	
	@Test(priority=2)
	public void addCurrency() {
		System.out.println("add currency Successfully");
	}
}
