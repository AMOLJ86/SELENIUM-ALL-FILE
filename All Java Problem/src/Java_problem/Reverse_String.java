package Java_problem;

import java.util.Scanner;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		System.out.print("please Enter a String :: ");
		String name=sr.next();
		
		 int leng=name.length();
		//System.out.println(leng);
		
	
		String rev=" ";
		
		
		for (int i=leng-1; i>=0; i--) {
			
			rev=rev+name.charAt(i);
		}
		System.out.print("Reverse String is :: "+rev);
	}

}
