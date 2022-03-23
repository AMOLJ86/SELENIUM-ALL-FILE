package StarProgram;

import java.util.Scanner;

public class Star2 {
	
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a size of columen :: ");
//		int row=sc.nextInt();
//		
		//int row=6;
		for(int i=1; i<6; i++) {
			
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		
		
		
	}

}
