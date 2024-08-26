package inheritance;

public class This_Keyword {
	
	int age;
	double salary;
	String name;
	
	void details(int age,double salary,String name) { //method parameter should be same as global
		//System.out.println("students");
		this.age=age;
		this.salary=salary;
		this.name=name;
		
	}

	public static void main(String[] args) {
		This_Keyword d1=new This_Keyword();
		d1.details(34,4567.56,"bhanu");
		System.out.println(d1.age);
		System.out.println(d1.salary);
	    System.out.println(d1.name);
	}

}
