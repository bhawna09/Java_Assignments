package ab44;

public class SIB_IIB {
	
	static {
		System.out.println("SIB BLOCK");  // SIB Used to create connection with d/b.
	}
	
	SIB_IIB(){
		System.out.println("constructor");
	}
	
	SIB_IIB(int a){
		System.out.println("constructor 1");
		
	}
	
	{
		System.out.println("IIB BLOCK");   //IIb execute first than constructor
	}
	
	{
		System.out.println("IIB BLOCK2");
	}

	public static void main(String[] args) {
		new SIB_IIB();
		new SIB_IIB(2);
		System.out.println("main method");
	
	}

}
