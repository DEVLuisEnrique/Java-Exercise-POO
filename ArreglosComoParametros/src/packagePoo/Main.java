package packagePoo;

public class Main {
	
	public static void showElements(int[] array) {//metodo de clase
		for(int i = 0; i < array.length; i++ ) 
			{
				System.out.print(array[i]+" ");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Clases y Objetos
		
		int numeros[] = new int[10];
		
		//llenamos el arreglo
		for(int valor = 0;valor < numeros.length; valor++) 
			{
				numeros[valor] = (int) (Math.random() * 100);
			}
		
		showElements(numeros); //mostrar el arreglo
		
		
	
	}
	

}
