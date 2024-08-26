package ab44;

import java.util.InputMismatchException;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		int rollno [] = new int[4];
		rollno[0] = 44;
		rollno[1] = 48;
		rollno[2] = 65;
		rollno[3] = 65;
		
	try {
			rollno[4] =21;
		}

		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("handled 1");
			
		}
		catch(NullPointerException n1) {
			System.out.println("handled 2");
			
		}
		catch (InputMismatchException i1) {
			System.out.println("handled 3");
		}
		
		finally{
			System.out.println("thankyou for visit to this website");
		}
	}

}
