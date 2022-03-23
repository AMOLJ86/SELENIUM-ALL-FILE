package Java_problem;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("Enter the number ::");
		int no=sr.nextInt();
		
		int temp=no;
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("reverse numbre is :: " +rev);
	
		if(no==rev) {
			System.out.println(no+" is Palindrome Number");
		}
		else {
			System.out.println(no+" is not palindrome Numbre");
		}
	}

}
