package predefinedclass;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		
	Scanner s1 = new Scanner(System.in);
		
	System.out.println("enter the number");
	
	int number= s1.nextInt();
	
		 
	 if (number % 2 == 0) {
         System.out.println(number + " is an even number.");
     } else {
         System.out.println(number + " is an odd number.");
     }
		
		s1.close();

	}

}
