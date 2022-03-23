package TestNgType;

import org.testng.annotations.Test;

public class TestNG_Priority {
	
  @Test(priority=2)
  public void abc() {
	  System.out.println("i am abc method =2 ");
  }
  
  @Test(priority=1)
  public void pqr() {
	  System.out.println("i am pqr mehtod =1");
	
	  
	  
  }
  @Test
  public void xyz( ) {
	  System.out.println("i am xyz method");
  }
  
  @Test
  public void abcd() {
	  System.out.println("i am abcd method");
}
  @Test(priority=1)
  public void qrs() {
	  System.out.println("Dublicate priority =1");
	  
  }
//  @Test(priority=-1)
//  public void amol() {
//	  System.out.println("i am pqr mehtod =1");
//}
} 

  