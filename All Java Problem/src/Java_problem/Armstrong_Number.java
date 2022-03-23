package Java_problem;

import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter the number :: ");
		int number=sr.nextInt();
		int t1=number;
		
		int length=0;
		
		while( t1 !=0) {//153
			
			t1=t1/10;//15,1,0.34
			length=length+1; //1,len=1+1=2,len=2=1=3
		}
		
		int t2=number;
		int rem;
		int arm=0;
		
		while(t2 !=0) { //153
			int mul=1;
			rem=t2%10; //3
			
			for(int i=1; i<=length; i++) {
			    mul=mul*rem;	
			}
			
			arm=arm+mul;
			
			t2=t2/10;
			
		}
		if(arm==number) {
			System.out.println(number+ " is Armstrong number");
		}
		else {
			System.out.println(number+" is not Armstrong Number");
		}
	     
		
		
		
		
	}

}
