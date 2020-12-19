package packagePoo;

public class Main {

	public static void main(String[] args) {
		
		/*Metodo abstracto
		 * es aquel que no posee un cuerpo,
		 * define que hacer pero no como.
		 * */
	
		Figura figuras[]  =  new Figura[2];
	
		//Circulo cirulos[];
		//Triangulo triangulos[];
		
		Figura circulo = new Circulo(9f);
		Figura triangulo = new Triangulo(10f,5f);
		
		figuras[0] = circulo;
		figuras[1] = triangulo;
		
		System.out.println(figuras[0].area());
		System.out.println(figuras[1].area());
		
		//Triangulo figura1 = new Triangulo();
		//figura1.setAltura(10);
		//figura1.setBase(4.10f);
		
		//System.out.println(figura1.area());
		

	}

}
