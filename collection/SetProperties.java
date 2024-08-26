package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class SetProperties {

	public static void main(String[] args) {
		
		Set s1 =new HashSet();
		s1.add("bhawna");
		s1.add(null);
		s1.add(null);
		s1.add(56);
		s1.add(34.5);
		System.out.println(s1);
		
		
		ArrayList a1= new ArrayList();
		a1.add(34);
		a1.add("bhanu");
		a1.add("bhanu");
		a1.add(45.5);
		a1.add(null);
		a1.add(null);
		a1.add(null);
		a1.add(12);
System.out.println(a1);
}
	
	
}