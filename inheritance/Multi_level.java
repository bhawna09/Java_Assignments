package inheritance;

class one
{
	static void add() {
		System.out.println("one is printed");
	}
}

class two extends one
{
	static void sub() {
		System.out.println("two is printed");
	}
}
public class Multi_level extends two {                      //subclass inheriting superclass 
	
	static void mul() {
		System.out.println("three is printed which is subclass");
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		

	}

}
