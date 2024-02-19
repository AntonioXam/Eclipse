package ejercicios1;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			int num;
			// Pedimos un número hasta introducir un entero positivo
			do {
				System.out.print("Introduce un número entero positivo: ");
				num=teclado.nextInt();
			} while (num<=0);

			// Recorremos todos los números desde 1 hasta el introducido

			System.out.print("Los primos menores que "+num+" son: ");
			for (int i=1; i<=num; i++) {
				if (Ejercicio28.esprimo(i)) {
					System.out.print(i+" ");
				}
			}
		} catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}
		teclado.close();
	}
}


