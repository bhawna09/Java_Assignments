package stringprograms;

public class ReverseofString {

	public static void main(String[] args) {
		
		String input="Bhawna";
		String output=" ";
		
		for (int i=5;i>=0; i--) {           //reversing a string
			char c1 = input.charAt(i);
			output = output+c1;
			}
		System.out.println(output);
			
	
	//to print string characters separately
		
	/* String name = "Anurag";
	 
	 for(int i= 0;i<=5;i++) {
		 char c2= name.charAt(i);
		 System.out.println(c2);
	 }
	 */
	}
}
