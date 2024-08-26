package predefinedclass;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("enter the base");
		
		int base= s1.nextInt();
		
		System.out.println("enter the height");
		
		int height = s1.nextInt();
		
		 int area= base*height/2;
		
		System.out.println("Area of triangle is "+ area);
		
		s1.close();
		
	}

}
