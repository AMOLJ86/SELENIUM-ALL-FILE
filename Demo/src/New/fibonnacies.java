package New;

public class fibonnacies {
	public static void main(String[] args) {
		 int no=4;
		 System.out.println("Number si :: "+no);
		 int a=0,b=0,c=1;
		 System.out.print("f siries is : ");
		 for(int i=0; i<no; i++) {
			 a=b;
			 b=c;
			 c=a+b;
			 System.out.print(" "+a);
		 } 
			
		 System.out.println();
			 int fact=1;
			 for(int j=1; j<=no; j++) {
				 fact=fact*j;
				 
			 }
			 System.out.println( "factorial of 4 is " +fact);
			 
			 
			 
			 
			 if (no%2==0) {
				 System.out.println("Number is Even");
			 }
			 else {
				 System.out.println("number is odd");
			 }
			 
			 String name="LMOA";
			 String rev=" ";
			 int len=name.length();
			 for(int k=len-1; k>=0; k--) {
				 rev=rev+name.charAt(k);
				 
			 }
			 System.out.println(rev);
			 
		 }
	
	
		 
	

}
