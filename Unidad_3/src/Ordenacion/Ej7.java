package Ordenacion;

public class Ej7 {
	
	final static int TAM=10;
	final static int LIM=10;
	
	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}

	public static void imprimeArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

	public static void burbujaPro(int array[]) {
		int aux;

		boolean cambio;  //Tomará el valor true cuando se introduzca un intercambio de valores
		for (int i = array.length; i > 0; i--) {
			cambio=false;
			for (int j = 0; j < i-1; j++) {
				if (array[j]>array[j+1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
					cambio=true;
				}

			}
			if (cambio==false) 
				return;
		}
	}

	/**
	 * Una funcion que indica si un numero N pasado como parametro se encuentra entre los valores almcacenados 
	 * entre los varlores almacenados en un array de numeros enteros pasados como parametro
	 * @param array almacena numeros enteros
	 * @param N numero entero
	 * @return TRUE si N esta almacenado en array, FALSE si no está
	 */
	public static boolean encuenta(int array[], int N) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]==N)
				return true;

		}
		return false;

	}
	public static void main(String[] args) {


		int array[]=new int[TAM];

		for (int i = 0; i < array.length; i++) {
			array[i]=aleatorio(LIM);
		}

		System.out.println("Array sin ordenar: ");
		imprimeArray(array);


		burbujaPro(array);
		System.out.println("\nArray ordenado: ");
		imprimeArray(array);

		System.out.println("\nNo estan generados: ");
		for (int i =1; i <= array.length; i++) {
			if(!encuenta(array, i))

				System.out.print(i+" ");
		} 

	}

}