package Java_problem;

import java.util.Scanner;

public class palindrome_String {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr String ::");
        String name = sc.next();
       
        String rev="";
        int len=name.length();
        for(int i=len - 1; i >= 0; i--)
        {
            rev = rev + name.charAt(i);
            
        }
        System.out.println("Reverse Number is :: " +rev);
        
        
        if(name.equals(rev))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
}


            


}
