package predefinedclass;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	
	System.out.println("please enter the value of Radius");
	double r = s1.nextDouble();
	
	double area = Math.PI*r*r;
	System.out.println("area of circle is "+ area);
	s1.close();

	}

}
