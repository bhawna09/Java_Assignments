package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		 
		 Collection c1= new ArrayList();   //upcasting
		 c1.add("bhanu");
		 c1.add("colour");                //heterogeneous values as datatype is different
		 c1.add(45);
		 c1.add(false);
		 c1.add(45.67);
		 c1.add(null);
		 c1.add("bhanu");
		 System.out.println(c1);
		 
		Collection c2 = new ArrayList();
		c2.addAll(c1);
		c2.add("rice");
		c2.add("chapati");
	System.out.println(c2);
	
	            boolean b1 = c1.equals(c2);         //equals method
	            System.out.println(b1);
	            
	            boolean b2= c2.isEmpty();          //isEmpty method
	            System.out.println(b2);
	            
	          //c1.clear();                        //clear method
	         //System.out.println(c1);
	           
	           c1.remove(45);                     //remove method
	           System.out.println(c1);
	           
	      //   c2.removeAll(c1);                  //removeall method
	       //  System.out.println(c2);
	           
	           c2.containsAll(c1);               //conatainsAll
	           System.out.println(c2);
	           
	         boolean b3 = c2.contains("bhanu");    //contains
	         System.out.println(b3);
	         
	         System.out.println(c1.size());
		 
	}

}
