package inheritance;

class Parent{
void login() {                           //over-riden method and can be called using super keyword
	
System.out.println("login with mobile");
}


}

public class Method_overriding extends Parent {
	
	void login() {
		super.login();
		System.out.println("login with email id");
		
		
		}
	
	
	public static void main(String[] args) {
		
		Method_overriding m1 = new Method_overriding();
		m1.login();

	}

}
