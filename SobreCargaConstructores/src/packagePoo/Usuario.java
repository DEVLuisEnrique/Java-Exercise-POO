package packagePoo;

public class Usuario {
	public String username;
	private String password;
	
	//constructores
	public Usuario(){
		this.username = "";
		this.password = "";
	}
	
	public Usuario(String username){
		this.username = username;
	}
	
	public Usuario(String username, String password){
		this.username = username;
		this.password = password;
	}

	//metodos
	public void saludar() {
		System.out.println("Hola, mi nombre es "+this.username);
	}
	
	
	public String getPassword() {
		return password;
	}

	
	
	
}
