package packagePoo;

public class Main{
	/**
	 *Herencia
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Perro perro = new Perro("Rocky","Chihuahua",2);
		Gato gato  = new Gato("Domingo","Angora",3);
		
		
		
		gato.dormir();
		perro.dormir();
		
		
		
	}
	
	
}
