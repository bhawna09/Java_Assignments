package ab44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		
		System.out.println("enter your age");
		
		
		
		Scanner s1 = new Scanner(System.in);
		
		try {
			int age = s1.nextInt();

		}
		catch(InputMismatchException a1){
			System.out.println("sorry read carefully again");
			System.out.println("enter your age");
			Scanner s2 = new Scanner(System.in);
			int age1 = s2.nextInt();
			
			
		}
		System.out.println("Enter your firstname");
		Scanner s3 = new Scanner(System.in);
		String name = s3.next();
		s3.close();
		
		
		
		
	
	}

}
