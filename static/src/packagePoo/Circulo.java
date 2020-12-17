package packagePoo;

public class Circulo {
	public float radio = 0f; //le pertenece a la clase
	public static final float pi = 3.141516f; //es un atributo de instacia le pertenece al objeto
	
	public Circulo(float radio) {
		this.radio = radio;
	}
	
	public static float area(float radio) {
		return Circulo.pi * (radio * radio);
	}
	

}
