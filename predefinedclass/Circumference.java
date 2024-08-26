package predefinedclass;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("please enter the radius");
		
		double r = s1.nextInt();
		
		double circumference = 2 * Math.PI * r ;
		
		System.out.println("Circumference of circle is" + circumference);
		
		s1.close();
		
	

	}

}
