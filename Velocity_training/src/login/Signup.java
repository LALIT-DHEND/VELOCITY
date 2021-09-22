package login;

public class Signup {

	public static void main(String[] args) {
		Signup p = new	Signup();
		p.m(1234);
		Login a=new Login();
		
	}
	
	int u=1234;
	 public void m(int m) {
		while(u!=0) {
			u=u/10;
			System.out.print(u);
		}
		
	}

}
