package packagePoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Clases y Objetos
		
		Perro perro1 = new Perro(); //Instancia
		
		perro1.raza = "Chihuahua";
		perro1.edad = 4;
		perro1.nombre = "Rocky";
		
		System.out.println("El nombre es: "+perro1.nombre);
		System.out.println("La raza: "+perro1.raza);
		System.out.println("La edad es: "+perro1.edad);

	}

}
