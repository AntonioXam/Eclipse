package introduccion;

public class array {
	/* Propiedades y atributos*/
	
	private int longitud;
	private int[] valores;
	
	/* Metodos*/
	/**
	 * Contructor
	 * @param tam Numero de valores enteros que almacenaremos en el array
	 */
	
	public array(int tam) {
		longitud=tam;
		valores=new int[tam];
	}

	

	public int getLongitud() {
		return longitud;
	}



	public int[] getValores() {
		return valores;
	}



	public void mostrarValores() {
		for (int i = 0; i < longitud; i++) 
			System.out.print(valores[i]+" ");
		
	}

	public void ordena() {
		int aux;
		int menor=0;
		for (int i = 0; i < longitud-1; i++) {
			menor=i;
			for (int j = i+1; j < longitud; j++) {
				if (valores[j]<valores[menor])
					menor=j;
			}
			aux=valores[i];
			valores[i]=valores[menor];
			valores[menor]=aux;
					
		}
	}
			
			
	
	public void setValor(int N,int pos) {
		if (pos>=0 && pos<10) 
		valores[pos]=N;
		
	}

}
