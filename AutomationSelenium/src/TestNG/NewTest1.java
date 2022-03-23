package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
public class NewTest1 {
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
