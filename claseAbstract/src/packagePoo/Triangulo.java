package packagePoo;

public class Triangulo extends Figura{
	
	private float base, altura;
	
	
	public void setBase(float base) {
		this.base = base;
	}
	 public void setAltura(float altura) {
		 this.altura = altura;
	 }
	
	@Override
	public float area() {
		
		return (base * altura) / 2;
	}

}
