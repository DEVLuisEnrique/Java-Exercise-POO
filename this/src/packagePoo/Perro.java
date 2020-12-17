package packagePoo;
//parametros
public class Perro {
	//clase perro
	String nombre;
	String raza;
	int edad;
	
	// (this) hace referencia a los atributos de la clase. 
	
	//metodos
	void establecerAtributos(String nombre, int edad, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}
	
	void comer() {
		System.out.println("El perro se encuentra comiendo!");
		
	}
	
	void dormir() {
		System.out.println("El perro esta durmiendo!");
		
	}
	
	void correr() {
		System.out.println("El perro esta corriendo!");
		
	}

}
