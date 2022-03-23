package StarProgram;

import java.util.Scanner;

public class Star1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of columen :: ");
		int row=sc.nextInt();
		
		
		
		//int row=6;
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

	private static void nextInt() {
		// TODO Auto-generated method stub
		
	}

}
