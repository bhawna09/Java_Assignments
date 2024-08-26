package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class List1 {

	public static void main(String[] args) {
		//when heterogeneous it can access everything but not sort.
		List l1 = new ArrayList();
        l1.add(78);                    //follows indexing
        l1.add(45);                       //follows order of insertion
                                        //accepts null
        l1.add(0);                      
        l1.add(48);                     //is dynamic in nature :size kept on increasing
                              //accepts duplicate
     
       Collections.sort(l1);          //accepts heterogeneous but if we have to sort than
                                       // we have to make them homogeneous
      
      System.out.println(l1);
      
      Iterator i1=l1.iterator();
      while (i1.hasNext()) {
			 
			 System.out.println(i1.next());
		 }
      
      System.out.println("forwrd iteration using list iterator");
      ListIterator i2=l1.listIterator();   
      while (i2.hasNext()) {
			 
			 System.out.println(i2.next());
		 }
      
      System.out.println("Backward iteration using list iterator");
      
      while (i2.hasPrevious()){
    	  System.out.println(i2.previous());
      }
	}

}
