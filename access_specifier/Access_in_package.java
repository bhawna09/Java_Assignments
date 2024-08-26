package access_specifier;

public class Access_in_package  {

	public static void main(String[] args) {
		
		Classpackage2 c1= new Classpackage2();
		c1.method1();
		c1.method2();         // it cannot access private method 
		c1.method4();
		

	}

}
