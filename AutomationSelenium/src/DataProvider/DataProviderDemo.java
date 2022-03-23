package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	@DataProvider(name="TestData" )
	public Object[][] getData1(){
		
		Object[][] data=new Object[2][3];
		
		        data[0][0]="user1";
				data[0][1]="password1";
				data[0][2]="Story1";
				
				
				data[1][0]="user2";
		     	data[1][1]="password2";
		     	data[1][2]="Hello2";
				return data;
				
				
				
		
	}
	
	@Test(dataProvider="TestData")
	public void login(String username,String password,String abc) {
		System.out.println("Username is : " +username);
		System.out.println("Password is : " +password);
		System.out.println("Third arg is :"  +abc);//Hello1

		
		
	}

	
	
}
