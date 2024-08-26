package collection;


import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue p1 = new PriorityQueue();
	//	p1.add(45);
	//	p1.add(30);     not heterogeneous ,not follow indexing and insertion order
		p1.add("manu");
		p1.add("bhanu");
		p1.add("somya");
	//	p1.add(null);  not accepting null values 
	//	p1.add(null);
		p1.add("bhanu"); 
		p1.add("somya");
		System.out.println(p1);
		}
	

}

