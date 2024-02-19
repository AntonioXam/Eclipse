package Arrays;

public class Ejemploclonar {

	/**
	 * Muestra por pantalla los valores almacenados en un array
	 * @param array de numeros enteros
	 */
	private static void imprime(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			
		}
		
	}
	public static void main(String[] args) {
		int[] A= {1,2,3,4,5};
		int[] B;
		
		System.out.print("A: ");
		imprime(A);
		
		//Metodo de clonación de array
		B=A.clone();
		
		
		System.out.print("\nB: ");
		imprime(B);
		
		for (int i = 0; i < B.length; i++) {
			B[i]*=10;
			
		}
			System.out.print("\nB: ");
			imprime(B);	
			System.out.print("\nA: ");
			imprime(A);
			
		
		

	}

}
