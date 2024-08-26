package abstractclass;

 abstract class Amazon{       //abstract class : abstract should be written before it
	
	 abstract void login();
	 abstract void register();     //abstract methods
     }

public class Abstract_class extends Amazon {            //concrete class

	static void logout()         //concrete method
	{
		System.out.println("logout");
	}
	static void  run()
	{
		System.out.println("run");
	}

@Override
void login()
{
	 int a=10;
	 int b=20;
	int c=a+b;
			System.out.println(c);
}

@Override
void register() 
{
	System.out.println("register");
	
}

public static void main(String []args) {
	Abstract_class l1= new Abstract_class();
    l1.login();
    l1.register();
    logout();
}
}
