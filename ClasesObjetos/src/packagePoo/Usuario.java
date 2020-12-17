package packagePoo;

public class Usuario {
	
	public String username;
	
	public Usuario(String username) {
		this.username = username;
	}
	
	public void establecerRol() {
		Administrador adm = new Administrador();
		adm.trabajar();
	}
	
	
	class Administrador{ //Clase administrador
		
		public void trabajar() {
			System.out.println("El administrador "+username+" se encuentra trabajando");
		}
	}

}
