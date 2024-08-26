package typecasting;

class ParentType{
	
}

public class ClassType1 extends ParentType{

	public static void main(String[] args) {
		
 ParentType p1=new ClassType1();    //upcasting
 
 
 ParentType p2=(ParentType)new ClassType1();   //explicit upcasting
 
 
 ClassType1 c2 = (ClassType1) p1;   //downcasting
 //explicilty
 
 //both parent and child class property can be accessed
	}

}
