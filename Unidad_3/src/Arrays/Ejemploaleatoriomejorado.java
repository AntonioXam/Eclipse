package Arrays;

import java.util.Scanner;



public class Ejemploaleatoriomejorado {

	final static int TAM=10;     //Longitud del array
	final static int LIM=100;    //Numeros generados entre 1 y N

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {


			int Arreatorio[]=new int[TAM];

			for (int i = 0; i < Arreatorio.length; i++) {
				Arreatorio[i]=aleatorio(LIM);
			}

			System.out.print("Array sin ordenar: ");
			imprime(Arreatorio);


			ordenarpro(Arreatorio);
			System.out.print("\nArray ordenado: ");
			imprime(Arreatorio);




		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}

		sc.close();
	}

}
