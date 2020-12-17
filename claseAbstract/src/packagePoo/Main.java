package packagePoo;

public class Main {

	public static void main(String[] args) {
		
		/*Metodo abstracto
		 * es aquel que no posee un cuerpo,
		 * define que hacer pero no como.
		 * */
	
		Triangulo figura1 = new Triangulo();
		figura1.setAltura(10);
		figura1.setBase(4.10f);
		
		System.out.println(figura1.area());
		

	}

}
