package TestNgType;

import org.testng.annotations.Test;

public class timeOut {
	@Test
	  public void case1() {
		  System.out.println("i am case1 Method");
	  }
	@Test(timeOut=1000)
	  public void case2() {
		  System.out.println("i am case2 Method");
	  }
	@Test
	  public void case3() {
		  System.out.println("i am case3 Method");
	  }
}
