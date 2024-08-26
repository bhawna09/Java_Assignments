package predefinedclass;

import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {
			
			Scanner s1 = new Scanner(System.in);
			
			System.out.println("please enter the value");
			
			double a = s1.nextDouble();
			double b = s1.nextDouble();
			double c = s1.nextDouble();
			
			
			double circumference = a+b+c ;
			
			System.out.println("Circumference of triangle is" + circumference);
			
			s1.close();
			
		

		}

	}