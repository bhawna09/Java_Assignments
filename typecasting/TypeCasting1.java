package typecasting;

class ParentType2{
	
	static void add() {
		System.out.println("add");
	}
	
	static void sub() {
		System.out.println("sub");
	}

	public void mul() {
		System.out.println("mul");
	}
	
	public void div() {
		System.out.println("div");
	}
	
}

public class TypeCasting1 extends ParentType2 {
	
	static void login() {
		System.out.println("login");
	}
	
	static void register() {
		System.out.println("register");
	}

	public void logout() {
		System.out.println("logout");
	}
	
	public void cart() {
		System.out.println("cart");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Implicit Upcasting inheriting parent class properties");
		
		 ParentType2 p1  = new TypeCasting1();    //implicit upcasting
		 p1.div();           //parentclass properties
		 p1.mul();
		 add();
		 sub();
		 
		 System.out.println("Explicit Downcasting inheriting parent and child class properties");
		 TypeCasting1 c1=(TypeCasting1)p1;
		 c1.cart();
		 c1.div();
		 c1.logout();
		 c1.mul();
		 add();
		 sub();
		 register();
		 login();
		
		
		
		
		   
	}

}
