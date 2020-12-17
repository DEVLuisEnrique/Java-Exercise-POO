package packagePoo;
//parametros
public class Perro {
	//clase perro
	String nombre;
	String raza;
	int edad;
	
	
	//metodos
	void establecerAtributos(String nombrePerro, int edadPerro, String razaPerro) {
		nombre = nombrePerro;
		edad = edadPerro;
		raza = razaPerro;
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
