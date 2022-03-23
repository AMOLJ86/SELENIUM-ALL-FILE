package ArrayProgram;
import java.util.Scanner;

public class ArrayMax {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array Element :: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter "+n +" number of Array Element :: ");
		for (int i=0; i<n; i++) {
			a[i]=sc.nextInt();
			
		}
			
		System.out.println("Array Element is ");
		for(int i=0; i<n; i++) {
			System.out.println(" "+a[i]);
		}
		
		int max=a[0];
		for(int i=0; i<n; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum Array Element is :: "+max);
		
	}

}
