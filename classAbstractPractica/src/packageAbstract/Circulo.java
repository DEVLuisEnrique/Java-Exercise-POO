package packageAbstract;

public class Circulo extends Figura{
	// area = pi * r^2

	private float radio;
	final float pi = 3.141516f;
	
	@Override
	public float area() {
		
		return pi * (radio * radio);
	}
	
	public void setRadioCirculo(float radio) {
		this.radio = radio;
	}
}
