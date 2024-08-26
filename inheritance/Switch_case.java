package inheritance;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("please entr number from 1 to 3");
		int c= s1.nextInt();
	switch (c) 
	{
	case 1:
		System.out.println("launch Chrome browser");
	    break;
	case 2:
		System.out.println("launch Firefox browser");
	    break;
	case 3:
		System.out.println("launch edge browser");
	    break;
	default:
		System.out.println("wrong selection");
	    break;
	
	}
	s1.close();

}

}