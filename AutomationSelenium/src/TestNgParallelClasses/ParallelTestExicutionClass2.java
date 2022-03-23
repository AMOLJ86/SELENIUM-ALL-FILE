package TestNgParallelClasses;

import org.testng.annotations.Test;

public class ParallelTestExicutionClass2 {
	@Test
	  public void TestCase5() {
		long id=  Thread.currentThread().getId();
		System.out.println("Test Case 5 Successfuly Thread id is : "+id);
		
	  }
	  @Test
	  public void TestCase6() {
		long id=  Thread.currentThread().getId();
		System.out.println("Test Case 6 Successfuly Thread id is : "+id);
		
	  }
	  @Test
	  public void TestCase7() {
		long id=  Thread.currentThread().getId();
		System.out.println("Test Case 7 Successfuly Thread id is : "+id);
		
	  }
	  @Test
	  public void TestCase8() {
		long id=  Thread.currentThread().getId();
		System.out.println("Test Case 8 Successfuly Thread id is : "+id);
		
	  }
}
