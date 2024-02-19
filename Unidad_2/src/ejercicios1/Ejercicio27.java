package ejercicios1;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			int num;
			// Pedimos un número hasta que el introducido sea un entero positivo
			do {
				System.out.print("Introduce un número entero positivo: ");
				num=teclado.nextInt();
			} while (num<=0);
			// Mostramos por pantalla sus divisores
			System.out.print("Los divisores de "+num+" son: ");
			for (int i=1; i<=num; i++) {
				if (num%i==0) {
					System.out.print(i+" ");
				}
			}
		} catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}
		teclado.close();
	}
}
