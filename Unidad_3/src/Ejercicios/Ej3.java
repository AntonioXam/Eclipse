package Ejercicios;

import java.util.Scanner;

public class Ej3 {

	final static int TOTAL=10; //Número de elementos del vector
	/**
	 * Función que calcula la media de los valores almacenados en un array de números enteros
	 * @param array de números enteros
	 * @return media (tipo double)
	 */
	public static double media(int[] array) {
		int suma = 0;
		for (int i=0; i<array.length; i++) {
			suma=suma+array[i];
		}
		return (double)suma/array.length;
	}
	/**
	 * Función que devuelve el mayor valor almacenado en un array de números enteros
	 * @param array de números enteros
	 * @return número entero
	 */
	public static int mayor(int[] array) {
		int may=array[0];
		for (int i=1; i<array.length; i++) {
			if (may<array[i])
				may=array[i];

		}
		return may;
	}
	/**
	 * Función que devuelve el menor valor almacenado en un array de números enteros
	 * @param array de números enteros
	 * @return número entero
	 */
	public static int menor(int[] array) {
		int men=array[0];



		for (int i=1; i<array.length; i++) {
			if (men>array[i])
				men=array[i];

		}
		return men;
	}
	// Main
	public static void main(String[] args) {
		// Creamos el vector que almacenará los números leídos por teclado
		int[] vector = new int[TOTAL];
		// Leemos los números introducidos por teclado y los almacenamos en vector
		Scanner sc = new Scanner(System.in);
		
		try {
			for (int i=0; i<TOTAL; i++) {
				System.out.print("Valor ["+(i+1)+"] :");
				vector[i]=sc.nextInt();
			}
			
		} catch (Exception e) {

			System.out.println("Error en la introducción de datos");

		}
		sc.close();
		// Mostramos los valores obtenidos
		System.out.println("\nMedia: "+media(vector));
		System.out.println("Mayor: "+mayor(vector));
		System.out.println("Menor: "+menor(vector));
	}
}