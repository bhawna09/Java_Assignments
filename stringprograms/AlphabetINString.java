package stringprograms;

import java.util.Arrays;

public class AlphabetINString {
	
	static int count_of_alphabet =0;
	static int count_of_numbers =0;
	static int count_of_space =0;

	public static void main(String[] args) {
		String name = "hero no 1";
		
		char c[]=name.toCharArray();  //it will convert it to characters of array
		
		System.out.println(Arrays.toString(c));
		
		for(int i=0; i<name.length();i++) {
			
			boolean ans=Character.isAlphabetic(c[i]);
		
	  // System.out.println(ans);
		
	    
	    if(ans== true) {
	    	count_of_alphabet++;
	    }
		}	
	    	System.out.println("the count of Alphabet is" +count_of_alphabet);
	    
	
		 System.out.println("finding numeric");
		 for(int i=0; i<name.length();i++) {
				
				boolean ans=Character.isDigit(c[i]);
			
		   // System.out.println(ans);
		    
		    if(ans== true) {
		    	count_of_numbers++;
		    }
			}	
		    	System.out.println("the count of digits are "
		    			+ "" +count_of_numbers);
		 
		    	 System.out.println("finding space");
		        for(int i=0; i<name.length();i++) {
				
				boolean ans=Character.isSpaceChar(c[i]);
			
		  //  System.out.println(ans);
				  if(ans== true) {
				    	count_of_space++;
				    }
					}	
				    	System.out.println("the count of space is " +count_of_space);
				 
             }
       }
