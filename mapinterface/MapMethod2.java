package mapinterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethod2 {

	public static void main(String[] args) {
		Map <String,Double> m2 = new HashMap<String,Double>();  //in form of wrapperclass
		m2.put("Bhawna",31.0);
		m2.put("alka", 58.0);
		m2.put("morni", null);
		
		m2.keySet();                       //keyset returns set
			Set<String> s1 = m2.keySet(); 
			System.out.println(s1);
			
	//  m2.values();                       //values return collection
	//  Collection <Double> c = m2.values();
	 // System.out.println(c);
			
			for (String s2: m2.keySet())
			{
			System.out.println(s2);
			}
			
			
			for (Double s2: m2.values())
			{
			System.out.println(s2);
			}
			
			for (Entry<String,Double> e1: m2.entrySet())
			{
			System.out.println(e1);
			}
			
			Iterator<Entry<String,Double>>i2=m2.entrySet().iterator()	;
			while (i2.hasNext())
			{
				System.out.println(i2.next());
			}
			
	}

}
