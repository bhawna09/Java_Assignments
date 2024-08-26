package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String[] args) {
	Map<String,Double> m1= new HashMap<String,Double>();
	m1.put("Bhawna",31.0);
	m1.put("alka", 58.0);
	//m1.put("Bhawna",31);
	m1.put("dheeru", null);
	System.out.println(m1);		
	//m1.clear();
	//System.out.println(m1);
	m1.remove("dheeru");
	System.out.println(m1);
	System.out.println(m1.containsKey("Bhawna"));
	System.out.println(m1.containsValue(21));
	
	Map <String,Double> m2 = new HashMap<String,Double>();
	m2.putAll(m1);
	System.out.println(m2);
	m2.put("rohit", 33.5);
	System.out.println(m2);
	
	boolean m3 = m2.equals(m1);
	System.out.println(m3);
	
	if (m1.size()==m2.size()) {
		System.out.println("size is same");
	}
		else {
			System.out.println("size is not same");
	}
	
	System.out.println(m1.remove("Bhawna"));
	System.out.println(m1.replace("alka", 58.0, 60.0));
	System.out.println(m1);
	}

}
