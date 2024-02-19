package ejercicios1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		try {

			// Leemos desde el teclado un número entero positivo
			Scanner teclado = new Scanner(System.in);

			System.out.print("Introduce un número: ");

			int N=teclado.nextInt();
			teclado.close();
			// Si el número introducido es positivo, mostramos la tabla de dobles y triples
			if (N>0) {
				System.out.println("Num\tDoble\tTriple");
				for (int i=1; i <= N; i++) {
					System.out.println(i+"\t"+(2*i)+"\t"+(3*i));
				}
			} else {
				System.out.println("No has introducido un número positivo");
			}
		} catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}
	}
}