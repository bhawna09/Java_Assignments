package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		v1.addElement(34);
		v1.addElement(45);
		v1.addElement("bhanu");
		v1.addElement("shreya");
		v1.addElement("bhanu");
		v1.addElement("shreya");
		v1.addElement(null);
		v1.addElement(null);
	
		System.out.println(v1.capacity());
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		System.out.println(v1.removeElement("bhanu"));
		System.out.println(v1);
		
		
		System.out.println("Enumeration Example");
		
		
        Vector v = new Vector();
        v.add(10);
        v.add("jyoti");
        v.add(15.5);
        Enumeration e = v.elements();               //vector by enumeration
        while(e.hasMoreElements()) {
        	System.out.println(e.nextElement());
        }
        
        Iterator i1 = v.iterator(); 
        while(i1.hasNext()) {
        	System.out.println(i1.next());        //vector by Iterator
        }
        
        System.out.println("Forward ListIteration");
        
        ListIterator l1 = v.listIterator();       //vector by List Iterator
        while(l1.hasNext()) {
        	System.out.println(l1.next());
        }
        
        System.out.println("Backward ListIteration");
        while(l1.hasPrevious()) {
        	System.out.println(l1.previous());  //for backward we need to first do forwrd iteration
        }
}
	}

