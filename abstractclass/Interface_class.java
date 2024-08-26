package abstractclass;

interface Grandparent{
	void method1();
	void method2();
}

class Parent implements Grandparent{                   //concrete method can be both static and non-static
	
	void method3(){
		
	}
	
	static void method4() {
		
	}

	@Override
	public void method1() {         //we can directly call unimplemented method in child class but we need to make parent class as abstract

		}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}

public class Interface_class extends Parent {
	
	void method5() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
