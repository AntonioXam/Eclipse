package Ejercicios;

import java.util.Scanner;

public class Ej2 {

	final static int TOTAL=10; //Número de elementos del vector

	public static void main(String[] args) {

		// Creamos el vector que almacenará los números leídos por teclado
		int[] vector = new int[TOTAL];
		double media; // Media de los números almacenados en el vector
		int mayor; // Mayor valor almacenado en el vector
		int menor; // Menor valor almacenado en el vector
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
		// Inicializamos la media, el mayor y el menor al primer valor almacenado en el array
		media=mayor=menor=vector[0];
		// Recorremos el resto del vector y calculamos la media, el mayor y el menor
		for (int i=1; i<TOTAL; i++) {
			media=media+vector[i];
			if (mayor<vector[i])
				mayor=vector[i];
			if (menor>vector[i])
				menor=vector[i];

		}
		media=media/TOTAL;
		// Mostramos los valores obtenidos
		System.out.println("\nMedia: "+media);
		System.out.println("Mayor: "+mayor);
		System.out.println("Menor: "+menor);
	}
}