package packagePoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Clases y Objetos
		//Parametros
		
		Perro perro1 = new Perro(); //Instaciamos nuestro objeto
		
		perro1.raza = "Chihuahua";
		perro1.edad = 4;
		perro1.nombre = "Rocky";
		perro1.establecerAtributos("Lassie", 2, "Pastor Aleman");
		
		perro1.comer();
		perro1.correr();
		perro1.dormir();
		System.out.println("El nombre es: "+perro1.nombre);
		System.out.println("La raza: "+perro1.raza);
		System.out.println("La edad es: "+perro1.edad);

	}

}
