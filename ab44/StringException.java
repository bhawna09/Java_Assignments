package ab44;

public class StringException {

	public static void main(String[] args) {
	
		
		String name = "Bhawna";
		
	   try{
	            char c1 = name.charAt(6);
	            System.out.println(c1);
			}
	
		catch(StringIndexOutOfBoundsException s1)
		{
		System.out.println("Exception is handled");	
	}
	   finally{
		   System.out.println("Concept of handling StringOutOfBound");
	   }

}
}
