package packagePoo;

public class Operaciones {
	
	
	
	//metodo llenar arreglo
	public void llenarArray(int array[]) {
		
		for(int i = 0; i < array.length; i++) 
			{
				array[i] = (int) (Math.random()*100);
			}
		
	}
	
	//imprimir arreglo
	public void getArray(int array[]) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
	}
	
	//ordenar arreglo metodo burbuja
	
	public void ordenarArray(int array[]) {
		{
			int aux;
			boolean cambio = false;
			
			while(true) 
				{
					cambio = false;
					for (int i = 1; i < array.length; i++) 
						{
							if(array[i] < array[i-1]) 
								{
									aux = array[i];
									array[i] = array[i-1];
									array[i-1] = aux;
									cambio = true;
								}
							
						}
					if(cambio == false) 
						{
							break;
						}
					
				}
			
		}
		
	} 

}
