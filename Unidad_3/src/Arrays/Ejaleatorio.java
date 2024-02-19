package Arrays;



import java.util.Scanner;



public class Ejaleatorio {

	final static int TAM=100;     //Longitud del array
	final static int LIM=50;    //Numeros generados entre 1 y N

	/**
	 * Funcion numeros aleatorios entre 1 y N	
	 * @param N numero entero positivo ,representa el limite superior del numero aleatorio
	 * @return devuelve un numero entero aleatorio entre 1 y N
	 */
	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}

	/**
	 * Funcion que imprime el array
	 * @param array parametro del array valores enteros
	 */
	public static void imprime(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

	/**
	 * Es una funcion que ordena el array por el metodo de la burbuja
	 * @param array valor del array
	 */
	public static void ordenarpro(int array[]) {
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
	 * Funcion que combina dos  arrays pasados por parametros
	 * @param array1 array valores enteros
	 * @param array2 array valores enteros
	 * @return
	 */
	public static int[] combina(int array1[], int array2[]) {
		//Creo el array de tamaño igual a la suma de los tamaños de los arrays parametros
		int[] nuevo= new int[array1.length+array2.length];
		int i=0; //contador
		for (int j = 0; j < array1.length; j++) {
			nuevo[i]=array1[j];
			i++;
		}
		for (int j = 0; j < array2.length; j++) {
			nuevo[i]=array2[j];
			i++;
		}
		
		ordenarpro(nuevo);
		return nuevo;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

		
			int A[]=new int[TAM];
			

			for (int i = 0; i < TAM; i++) {
				A[i]=aleatorio(LIM);
				
			}
			
			
			
			System.out.println("Array A:");
			imprime(A);
			
	

			

			
			System.out.println();
			System.out.println("\nMayor: "+A[A.length-1]);
			System.out.println("\nMenor: "+A[0]);


		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}

		sc.close();
	}

}
