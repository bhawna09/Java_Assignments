package stringprograms;

import java.util.Arrays;

public class SpecialcharinString {
	
	
	static int Count_of_alphabet=0;
	static int count_of_spcl_char=0;
    static int Count_of_number = 0;
	public static void main(String[] args) {
		
		String s = "Bhawna@123%%09/08/1992";
		

		char c[]=s.toCharArray();  
		
		System.out.println(Arrays.toString(c));
		 int total =s.length();
		
		System.out.println(total);
		
		for(int i=0; i<total;i++) {
			
			boolean ans=Character.isAlphabetic(c[i]);
		
		//System.out.println(ans);

        if(ans== true) {
    	Count_of_alphabet++;
      }
	}	
    	System.out.println("the count of alphabet is " +Count_of_alphabet);
    
	for(int i=0; i<s.length();i++) {
		
		boolean ans=Character.isDigit(c[i]);
	
	//System.out.println(ans);

    if(ans== true) {
	Count_of_number++;
  }

	}
	System.out.println("the count of number is " +Count_of_number);
	
	
	 int count_of_spcl_char = total -Count_of_alphabet-Count_of_number;
	 
	 System.out.println("count of special characters is " +count_of_spcl_char);
	}
	
	}


