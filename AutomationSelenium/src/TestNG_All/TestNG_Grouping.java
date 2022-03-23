package TestNG_All;

import org.testng.annotations.Test;

public class TestNG_Grouping {
	
  @Test(groups= {"sanity","Regression"},priority=1)
  public void Login() {
	  System.out.println("login successfuly");
  }
  
  @Test(groups= {"sanity","Regression"},priority=10)
  public void logout() {
	  System.out.println("logout successfuly");
  }
  
  @Test(groups= {"sanity"},priority=4)
  public void Search() {
	  System.out.println("search successfuly");
  }
  @Test(groups= {"Regression"},priority=3)
  public void AddVendar() {
	  System.out.println("Add Vendar successfuly");
  }
  @Test(groups= {"sanity","Regression"},priority=5)
  public void PrepaidRecharge() {
	  System.out.println("PrepaidRecharge successfuly");
	  
  }
  
  @Test(priority=2)
  public void advancedSearch() {
	  System.out.println("advancedsearch successfuly");
	  
  }
  @Test(groups= {"Regression"},priority=6)
  public void billPayment() {
	  System.out.println("Bill Payment successfuly");
  }
}

