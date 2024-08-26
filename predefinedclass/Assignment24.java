package predefinedclass;

import java.util.Scanner;

public class Assignment24 {

	public static void main(String[] args) {
		
			Scanner s1 = new Scanner(System.in);
					
			System.out.println("please enter the value of a");
					
			double a = s1.nextDouble();
			
			System.out.println("please enter the value of b");
					
			double b = s1.nextDouble();
			
			System.out.println("please enter the value of h");
			
			double h = s1.nextDouble();
					
		   double area = 0.5*(a+b)*h ;
					
					System.out.println("area of trapezium is" + area);
					
					s1.close();
					
				

		}


}

