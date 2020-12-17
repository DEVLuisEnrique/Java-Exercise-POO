package packagePoo;

public class Calculadora {
	
	//sobrecarga de metodos
	
	//entero
	public int suma(int...numeros) {
		int suma = 0;
		System.out.println(numeros.length);
		for(int numero : numeros) 
			{
				suma+=numero;
			}
		return suma;
	}
	
	public int suma(int value1, int value2) {
		return value1 + value2;
	}
	
	public int suma(int value1, int value2, int value3) {
		return value1 + value2 + value3;
	}
	//flotante
	public float suma(float value1, float value2) {
		return value1 + value2;
	}
	//double
	public double suma(double value1, double value2) {
		return value1 + value2;
	}
	
	

}
