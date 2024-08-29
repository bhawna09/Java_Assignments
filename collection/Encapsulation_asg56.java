package collection;


class Amazon_program {
	
	private String username = "bhawna@gmail.com";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	private String password = "bhanuji123";

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
}

public class Encapsulation_asg56 {
	
	public static void main(String[] args) {
		Amazon_program a1 = new Amazon_program();
	    a1.setUsername("purnima@gmail.com");
		System.out.println(a1.getUsername());
		
		a1.setpassword("dholak@123");
		System.out.println(a1.getpassword());
	}

}
