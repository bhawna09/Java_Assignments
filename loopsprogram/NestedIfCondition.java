package loopsprogram;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		char gender1 = 'M';
		char gender2 = 'F';
		int age=78;
		
		if(gender2=='k') {
			
			System.out.println("travelling is free");
		}
		
		else
			
			if(gender1 =='M') {
				if(age <=12) {
			 
					System.out.println("you can purchase half ticket");
				}
				else if(age>12 && age <=59) {
			        System.out.println("you can purchase full ticket");
					}
				else if  (age> 60) {
						System.out.println("you are senior citizen");
					}
					
		}
			
	}
	}

