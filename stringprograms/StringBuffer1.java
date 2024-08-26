package stringprograms;

public class StringBuffer1 {

	public static void main(String[] args) {
      StringBuffer s1 = new StringBuffer("Bhawna");
      s1.append(" Narula");                
      System.out.println(s1);
      
      s1.insert(7, "rohit ");
      System.out.println(s1);
      
  //    s1.replace(0,6, "Ananya");    //indexing is 5 but we take +1 than it must be taken as 6
  //    System.out.println(s1);
      
      StringBuffer s2 = new StringBuffer("manish tiwari");
  //    s2.delete(0,7);
   //   System.out.println(s2);
      
    //  s2.reverse();
     // System.out.println(s2);
     
 System.out.println(s2.substring(7));
      
 System.out.println(s2.substring(1,4));  //4 index is on s ,but should be taken upto 3rd index
 
 System.out.println(s2.capacity());    //13+16=29
 
 System.out.println(s2.length());     //13
	}

}
