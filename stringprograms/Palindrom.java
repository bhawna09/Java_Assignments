package stringprograms;

public class Palindrom {

	public static void main(String[] args) {
	 String input = "MADAM";
	 String output="";
	 
	 for (int i =input.length()-1;i>=0;i--)
	 {
	 
	 char c1= input.charAt(i);
	 
	 output= output +c1;
	 }
	 
	 System.out.println("the reverse of string is ->" + output );
 
    if(input.equals(output)) 
    {
    	
    	System.out.println("String is palandrome");
    }
    else
    {
    	System.out.println("not palandrome");
     }
 }
}
