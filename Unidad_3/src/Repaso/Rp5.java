package Repaso;

public class Rp5 {



	final static int TAM=10;     //Longitud del array
	final static int LIM=10;    //Numeros generados entre 1 y N

	/**
	 * funcion que determina un valor que se encuentra en el array
	 * @param array valores enteros
	 * @param N valor entero
	 * @param pos posicion del arrray hasta la que compararemos los valores
	 * @return TRUE o  fALSE N encuentra los valores almacenados
	 */ 
	public static boolean encuenta(int array[], int N, int pos) {
		for (int i = 0; i < pos; i++) {
			if(array[i]==N)
				return true;

		}
		return false;
	}

	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}


	public static void main(String[] args) {

		int array[]=new int[TAM];

		System.out.println("Generando numeros...");
		for (int i = 0; i < array.length; i++) {
			do {
			array[i]=aleatorio(LIM);
			}while(encuenta(array, array[i], i)) ;
			System.out.println(array[i]+" ");

		}
		System.out.println();
		
	}
}


