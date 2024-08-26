package stringprograms;

public class Stringmethods {

	public static void main(String[] args) {
		
		String s = "Manish Kumar Tiwari";
		
		String s1 = "manish Kumar Tiwari";
		System.out.println((s.charAt(4))); //s
		
		System.out.println(s.length());   //19
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.substring(4));
		
		System.out.println(s.substring(1, 11));   // ends at index-1
		
		System.out.println(s.indexOf('u'));  //8
		
		System.out.println(s.substring(0, 6));  //Manish
		
		System.out.println(s.substring(7,12));   //Kumar
		
		System.out.println(s.substring(13)); //Tiwari
		
		System.out.println(s1.trim()); // it will remove from start and end
		
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s.repeat(4));
		System.out.println(s.replace('M', 'V')); //Vanish Kumar Tiwari
		System.out.println(s.replace(s, s1));  //manish Kumar Tiwari
		System.out.println(s.replaceAll("[A-Z]", "")); //anish umar iwari
		System.out.println(s.replaceAll("[a-z]", "")); //M K T
		boolean ans=(s.contains("tiwari"));
		System.out.println(ans);
		
	   
				
				
}
}