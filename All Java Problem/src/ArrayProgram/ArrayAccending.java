package ArrayProgram;

import java.util.Scanner;

public class ArrayAccending {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		int i,j,temp=0;
		
		System.out.println("Enter "+n +" Number of array :: ");
		for(i=0; i<n; i++) {
			a[i]=sc.nextInt();
			}
		
		
		System.out.println("Array Element is :: ");
		for(i=0; i<n;i++) {
			System.out.println(" "+a[i]);
			
		}
		
		for(i=0; i<n; i++) {//3
			
		    for(j=i+1; j<n; j++) {// j 3
		    	if (a[i]>a[j]) {  //3>2 ,, 2>5X ,,2>1// 5>1
		    	    temp = a[i];//3,2'//5
		    		a[i]=a[j];//2,1   //1
		    		a[j]=temp;//3,2,  //5
		    	}
	
		    }
		}
		System.out.println("Array Assending is ::");
		for(i=0;i<n;i++) {
			System.out.println(" "+a[i]);
		}

		
		
		}
		
		
		
	}


