package collection;

class parent{
	
	private int rollno = 15;               //data member accesing privately

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;             //putting value of local variable to global variable
	}
	
	private int empid = 205;
	
	public void setEmpid(int empid) {
		this.empid = empid ;
	}
	
	public int getEmpid() {
		return empid ;
	}
	
}

public class Encap_Asg57 {

	public static void main(String[] args) {
		
		parent p1 = new parent();
		p1.setRollno(20);
		System.out.println(p1.getRollno());
		
		System.out.println("Accesing empid indirectly through getter and setter");
		p1.setEmpid(250);
		System.out.println(p1.getEmpid());

	}

}
