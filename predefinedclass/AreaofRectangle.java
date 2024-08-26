package predefinedclass;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		
	Scanner s1= new Scanner(System.in);
	
	System.out.println("please enter the length");
	
	int length = s1.nextInt();
	
	System.out.println("please enter the breadth");
	
	int breadth =s1.nextInt();
	
	 int area= length*breadth;
	 
	 System.out.println("Area of Rectangle is " + area);
	 
	 s1.close();
	
	
	
	}

}
