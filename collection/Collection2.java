package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection2 {

	public static void main(String[] args) {
		 
		 Collection c1= new ArrayList();   //upcasting
		 c1.add("bhanu");
		 c1.add("colour");                
		 c1.add(45);
		 c1.add(false);
		 c1.add(45.67);
		 System.out.println(c1);
		 
		 Iterator i1  = c1.iterator() ;       //what is iterator ?doubt
		
		 while (i1.hasNext()) {
			 
			 System.out.println(i1.next());
		 }
	}

}
