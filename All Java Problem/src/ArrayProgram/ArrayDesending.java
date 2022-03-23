package ArrayProgram;

import java.util.Scanner;

public class ArrayDesending {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre array size::");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		int i,j,temp=0;
				
		System.out.println("Enter "+n+" number of Array Element :: ");
		for(i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array Element is :: ");
		for(i=0;i<n; i++) {
			System.out.println(" "+a[i]);
		}
		
		// printing in Desending order
		
		for(i=0; i<n; i++) {
			for(j=i+1; j<n; j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		System.out.println("\nArray Elements in Desending Order: ");
		for(i=0;i<n;i++) {
			System.out.println(" "+a[i]);
		}

	}

}
