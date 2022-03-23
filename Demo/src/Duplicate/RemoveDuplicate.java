package Duplicate;

import java.util.Scanner;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String :: ");
		String w=sc.next();
		
		System.out.println("Originl String is :: " +w);
		
		String nw=" ";
		
		for(int i=0; i<w.length(); i++) {
			
			char ch=w.charAt(i);
			
			if(ch !=' ') {
				nw= nw+ch;
				w=w.replace(ch, ' ');
			}
			
		}
		System.out.println(" New Word :: "+ nw);

		
	}

}
