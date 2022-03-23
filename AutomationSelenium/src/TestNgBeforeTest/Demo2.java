package TestNgBeforeTest;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo2 {
	
	@BeforeSuite
	public void B_suite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void A_suite() {
		System.out.println("After Suite");
	}
	@Test
	  public void abc() {
		  Assert.assertEquals("yahoo", "yahoo");
	  }
	  
	 @Test
	 public void pqr() {
		 Assert.assertEquals("amol", "damol");
	 }
	 @Test
	 public void xyz() {
		 Assert.assertEquals("D", "a");
	 }
}
