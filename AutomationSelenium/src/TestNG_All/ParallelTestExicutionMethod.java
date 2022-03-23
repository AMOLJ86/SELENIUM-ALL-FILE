package TestNG_All;

import org.testng.annotations.Test;

public class ParallelTestExicutionMethod {
  @Test
  public void TestCase1() {
	long id=  Thread.currentThread().getId();
	System.out.println("Test Case 1 Successfuly Thread id is : "+id);
	
  }
  @Test
  public void TestCase2() {
	long id=  Thread.currentThread().getId();
	System.out.println("Test Case 2 Successfuly Thread id is : "+id);
	
  }
  @Test
  public void TestCase3() {
	long id=  Thread.currentThread().getId();
	System.out.println("Test Case 3 Successfuly Thread id is : "+id);
	
  }
  @Test
  public void TestCase4() {
	long id=  Thread.currentThread().getId();
	System.out.println("Test Case 4 Successfuly Thread id is : "+id);
	
  }
}
