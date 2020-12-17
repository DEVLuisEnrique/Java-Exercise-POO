package packagePoo;

public class Usuario {

	//public
	//private
	//default
	//protected
	
	public String username;
	private String password;
	
	public Usuario(String username, String password){ //constructor
		this.username = username;
		this.password = password;
	}
	
	
	void saludar() {
		System.out.println("Hola, mi nombre es "+this.username);
	}
	
	//getter
	public String getPassword() {
		return this.password;
	}
	//setter
	public void setPassword(String password) {
		this.password = password;
	}
	
}
