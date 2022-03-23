package Java_problem;

import java.util.Scanner;

public class Reverse_No {
	
	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		System.out.print("Enter the number ::");
		int no=sr.nextInt();
		  
		
		int temp=no;
		int rev=0,rem;
		while(temp!=0) {//456
			 
			rem=temp%10;//6,5,4
			rev=rev*10+rem;//60+5=650+4=654
			temp=temp/10;//45,4
			
		}
		System.out.println("Reverse no is :: " +rev);
	
	}
	

}