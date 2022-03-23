package ArrayProgram;

import java.util.Scanner;
public class ArrayMin {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array :: ");
		int n=sc.nextInt();
		
		
		
		int a[]=new int[n];
		System.out.println("Enter "+n+" Number of Array Element");
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		int min=a[0];
		for (int i=0; i<n; i++) {
			
			if(a[i]<min) {
				
				min=a[i];
				}
		}
		
		System.out.println("minimum Element is :: "+min);
	}

}
