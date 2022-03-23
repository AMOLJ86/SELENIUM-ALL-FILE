package Java_problem;

import java.util.Scanner;

public class Fibonnacies_series {
	
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("please Enter a number ::");
		int no=sr.nextInt();
		
		int a=0, b=0, c=1;
		System.out.print("fibonaccies series is :: ");
		for ( int i=0; i<no; i++) {
			
			a=b;
			b=c;
			c=a+b;
			System.out.print(a +" ");
		}
		
		
		
		
	}
	
	

}
