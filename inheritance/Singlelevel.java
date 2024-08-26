package inheritance;

class Amazon                                  //Super class
{
	static void loginwithemail() {
		System.out.println("email");
	}
	
	void registration() {                       //non-static superclass
		System.out.println("registration");
	}
}

public class Singlelevel extends Amazon {                    //sub class
      
	static void loginwithmobileno() {
		System.out.println("mobileno");
	}
	
	void logout() {                                 //non-static subclass
		System.out.println("logout");
	}
	
	public static void main(String[] args) {
		
		loginwithemail();
		loginwithmobileno();
		Singlelevel s1 = new Singlelevel();
		 s1.logout();
		s1.registration();
       

	}

}

//we cannot create object  of parent class in inheritance as it will only call parent mathod 
//by creating object from child class , it can call both