package typecasting;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
	//widening
		int a =100;
		double b = a ;    //implicit widening
		System.out.println(b  + " converting int to double datatype");
		
		int a1=100;       //explicit widening     //forcefully
		double b1 = (double)a1;
		System.out.println(b1);
		
		
		byte c = 50;
		float f = c;
		System.out.println(f + " converting byte to float datatype");
		
		byte age =15;
		short s = age;
		System.out.println(s + " converting byte to short datatype");
	
	//Narrowing
		double d = 789.90;
		int i= (int) d;        //narrowing done explicitly only
		System.out.println(i);
		
	}

}
