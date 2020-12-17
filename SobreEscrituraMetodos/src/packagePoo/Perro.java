package packagePoo;

public class Perro extends Mascota{
	
	
	
	public Perro(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		
	}
	@Override
	public void dormir() {
		System.out.println("El perro duerme");
	}
	
	
	
	
	
	

}
