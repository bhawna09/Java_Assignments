package inheritance;

class Youtube {
	
	Youtube(String a, double b){                  //parametrized constructor
	System.out.println("youtube");
	}
}

class Google extends Youtube {
	
	Google(){
	super("bhawna", 9.57);               //calling super() statement explicitly
	System.out.println("google");
		
	}
	
}

public class Super_calling extends Google {
	
	Super_calling(){
		//super                                      //calling implictly
	System.out.println("amazon");
		
		
	}

	public static void main(String[] args) {
		new Super_calling();
		
	}

}
