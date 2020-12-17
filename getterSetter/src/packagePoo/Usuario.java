package packagePoo;

public class Usuario {

	//public
	//private
	//default
	//protected
	
	public String username;
	private String password;
	
	void saludar() {
		System.out.println("Hola, mi nombre es "+this.username);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
