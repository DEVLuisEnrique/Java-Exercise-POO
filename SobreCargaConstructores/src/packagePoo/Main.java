package packagePoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Clases y Objetos
		
		Usuario user1 = new Usuario();
		Usuario user2 = new Usuario("Luis");
		Usuario user3 = new Usuario("Enrique","tecno12345");
		
		user1.saludar();
		user2.saludar();
		user3.saludar();
		
		user3.getPassword();
		System.out.println(user3.getPassword());
	
	}

}
