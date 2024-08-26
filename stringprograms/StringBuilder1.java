package stringprograms;

public class StringBuilder1 {

	public static void main(String[] args) {
		
		StringBuilder s= new StringBuilder();
		System.out.println(s.capacity());
		
		StringBuilder s1 = new StringBuilder("faridabad ");
		s1.append("city");
		System.out.println(s1);
		
		s1.insert(0, "haryana is a state");
		System.out.println(s1);
		
		s1.delete(8,12);
		System.out.println(s1);
		
		s1.replace(0,7, "delhi");
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("Bhawna Verma");
		System.out.println(s2.capacity());  //12+16 = 28
		
	//	s2.reverse();
	//	System.out.println(s2);
		
	//	s2.replace(0, 6, "ananya");
	//
		System.out.println(s2);
		
		System.out.println(s2.substring(7));
		System.out.println(s2.substring(1,4));
	}

}
