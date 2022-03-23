package Java_problem;

import java.util.Scanner;

public class Factorial_number {
	
	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		System.out.print("please Enter a number ::");
		int no=sr.nextInt();//4
		
		int fact=1;
		for(int i=1; i<=no; i++) {
			
			fact=fact*i;
		
		}
	    
		
		System.out.println("factorial of "+no +" is ::"+fact);
		
		
	
		
		
	}
	
	

}
