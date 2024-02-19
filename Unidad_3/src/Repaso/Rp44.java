package Repaso;

import java.util.Scanner;

public class Rp44 {



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

	public static void imprime(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}
	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}


	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int array[]=new int[TAM];

			System.out.println("Introduce Numeros: ");
			for (int i = 0; i < array.length; i++) {
				do {
					System.out.print("Valor ["+(i+1)+"] :");
					array[i] = sc.nextInt();
					if (array[i]<1 || array[i]>10) {
						System.out.print("Fuera del límite vuelve a introducir ");
					}
					
						if (encuenta(array, array[i], i)) {
							System.out.print("Está repetido vuelve a introducir ");
						}
						
				}while(array[i]<1 || array[i]>TAM || encuenta(array, array[i], i));
			}
			System.out.println();

			System.out.print("El array creado es: ");
			imprime(array);

		}
		catch (Exception e) {
			System.out.println("ERROR!");


		}

	}
}


