package inheritance;

public class This_calling {
	
	This_calling(){
		this(4.56,"automation");
		System.out.println("constructor with no para");
	}
	
	This_calling(int a){
System.out.println("constructor with one para");
	}
	
	This_calling(double a, String b){
		this(34);
		System.out.println("constructor with 2 para");
	}

	public static void main(String[] args) {
		new This_calling();

	}

}
