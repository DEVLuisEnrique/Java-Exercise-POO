package packagePoo;

public class Main {

	public static void main(String[] args) {
		//MODIFICADORES DE ACCESO
		Usuario user1 = new Usuario();
		
		user1.username = "Luis";
		user1.setPassword("**tecno12345@@");
		
		
		
		user1.saludar();
		System.out.println(user1.getPassword());

	}

}
