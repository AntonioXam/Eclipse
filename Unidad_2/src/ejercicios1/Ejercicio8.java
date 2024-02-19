package ejercicios1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] argv) {

		try {

			// Pedimos el número
			Scanner teclado = new Scanner(System.in);
			System.out.print("Introduce un número: ");
			int num=teclado.nextInt();
			teclado.close();

			// Si el número introducido es positivo, mostramos la lista de números impares

			if (num>0)
				for (int conta=2; conta <= num; conta+=2)
					System.out.print(conta + " ");
			else
				System.out.println("No has introducido un número positivo");
		} catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}
	}
}