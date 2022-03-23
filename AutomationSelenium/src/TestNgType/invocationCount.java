package TestNgType;

import org.testng.annotations.Test;

public class invocationCount {
  @Test(invocationCount=5)  //invocation count is use to exicute same test casses multiplem times
  public void case1() {
	  System.out.println("i am case1 Method");
  }
  @Test
  public void case2() {
	  System.out.println("i am case2 Method");
  }
}
