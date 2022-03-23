package TestNgType;

import org.testng.annotations.Test;

public class enabledFalse {
	@Test
	  public void case1() {
		  System.out.println("i am case1 Method");
	  }
	
	@Test(enabled=false)  //skip one of the test method to used enabled false type...
	  public void case2() {
		  System.out.println("i am case2 Method");
	  }
	
	@Test
	  public void case3() {
		  System.out.println("i am case3 Method");
	  }
}
