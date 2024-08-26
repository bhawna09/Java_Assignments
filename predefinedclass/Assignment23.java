package predefinedclass;

import java.util.Scanner;

public class Assignment23 {

	public static void main(String[] args) {
	
		Scanner s1 = new Scanner(System.in);
					
		System.out.println("please enter the value");
					
					double a = s1.nextDouble();
					double b = s1.nextDouble();
					
					
					double circumference = 2*(a+b) ;
					
					System.out.println("Circumference of Rectangle is" + circumference);
					
					s1.close();
					
				

				}

}
