package packagePoo;

public class Perro extends Mascota{
	
	
	
	public Perro(String nombre, String raza, int edad) {
		//this.nombre = nombre;
		//this.raza = raza;
		//this.edad = edad;
		super(nombre,raza,edad);
		
	}
	@Override
	public void dormir() {
		super.dormir(); //super hace referencia a la clase padre!
		System.out.println("El perro duerme");
	}
	
	
	
	
	
	

}
