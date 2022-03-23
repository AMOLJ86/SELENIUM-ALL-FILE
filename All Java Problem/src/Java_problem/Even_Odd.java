package Java_problem;

import java.util.Scanner;

public class Even_Odd {
	
	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		System.out.print("pleas Enter Number ::");
		int a=sr.nextInt();
		
	
		if (a%2==0) {
			
			System.out.println(a+" is Even Number.");
			
		}
		else {
			System.out.println(a+" is odd number.");
		}
	}

}
