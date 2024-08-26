package predefinedclass;

import java.util.Scanner;

public class Scaner_class {

	public static void main(String[] args) {

    Scanner s1 = new Scanner(System.in);
    System.out.println("please enter value of a");        //addition of 2 numbers
    int a = s1.nextInt();
    System.out.println("please enter value of b");
    int b = s1.nextInt();
    int sum = a+b;
    int sub = a-b;                                       //subtraction of 2 numbers
    int mul = a*b;
    int div = a/b;
    int mod = a%b;
    System.out.println("sum of 2 numbers are " +sum);
    System.out.println("sub of 2 numbers are " +sub);
    System.out.println("mul of 2 numbers are " +mul);
    System.out.println("div of 2 numbers are " +div);
    System.out.println("mod of 2 numbers are " +mod);
    s1.close();
	}

}
