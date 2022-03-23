package New;

public class eeee {
	public static void main(String[] args) {
		String name="LMOA";
		 String rev=" ";
		 int len=name.length();
		 for(int k=len-1; k>=0; k--) {
			 rev=rev+name.charAt(k);
			 
		 }
		 System.out.println(rev);
		 for (int i=len-1; i>=0; i--) {
				
				rev=rev+name.charAt(i);
			}
			System.out.print("Reverse String is :: "+rev);
		}
	}


