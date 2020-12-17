package packagePoo;

public class Gato extends Mascota {
	
	public Gato(String nombre, String raza, int edad) {
		//this.nombre = nombre;
		//this.raza = raza;
		//this.edad = edad;
		super(nombre, raza, edad);
		
	}
	
	@Override
	public void dormir() {
		System.out.println("El gato duerme");
	}

}
