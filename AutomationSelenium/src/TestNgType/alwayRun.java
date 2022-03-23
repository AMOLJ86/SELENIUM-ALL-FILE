package TestNgType;

import org.testng.Assert;
import org.testng.annotations.Test;

public class alwayRun {
	@Test(priority=1)
	public void abc() {
		  System.out.println("i am abc method =2 ");
	}

	@Test(dependsOnMethods= {"abcd"},alwaysRun=true)
	public void pqr() {
		  System.out.println("i am pqr mehtod =1");
		  
	}
	@Test(priority=2)
	public void xyz( ) {
		  System.out.println("i am xyz method");
	}

	@Test
	public void abcd() {
		 Assert.assertEquals("amol", "damol");
		
	}


}
