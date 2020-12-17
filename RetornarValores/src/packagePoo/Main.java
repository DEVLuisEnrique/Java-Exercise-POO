package packagePoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Clases y Objetos
		
		Triangulo triangulo = new Triangulo();
		
		triangulo.base = 10;
		triangulo.altura = 20;
		float result = triangulo.area();
		
		System.out.println(result);

	}

}
