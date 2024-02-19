package Repaso;



public class Encuentra {

	final static int TAM=10;     //Longitud del array
	final static int LIM=20;    //Numeros generados entre 1 y N

	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}

	/**
	 * Funcion que determine si un valor se encuentre almacenado en un array
	 * @param array  array de valores enteros
	 * @param N valor entero
	 * @return TRUE si N se encuenta entra entre los valores almaceandos en los arrays
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

		System.out.println("Generando numeros...");
		for (int i = 0; i < array.length; i++) {
			array[i]=aleatorio(LIM);
			System.out.print(array[i]);

			for (int j = 0; j < i; j++) {
				if (array[i]==array[j]) {
					System.out.print("---> repetido");
					break;
				}	
			}
			System.out.println();
		}
		
	}
}


