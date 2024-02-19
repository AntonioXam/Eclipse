package ejercicios1;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			int N, num, mayor, menor, suma;
			// Pedimos un número hasta introducir un entero positivo
			do {
				System.out.print("Introduce un número entero positivo: ");
				N=teclado.nextInt();
			} while (N<=0);
			// Leemos el primer número
			System.out.print("(1) Dime un número:");
			num=teclado.nextInt();
			// Inicializamos mayor, menor y suma al primer número introducido
			mayor=menor=suma=num;
			// Leemos el resto de números
			for (int i=2; i<=N; i++) {
				System.out.print("("+i+") Dime un número:");
				num=teclado.nextInt();
				suma+=num;
				if (num<menor)
					menor=num;
				if (num>mayor)
					mayor=num;

			}
			System.out.println("\nMedia: "+((float)suma/N));
			System.out.println("Mayor: "+mayor);
			System.out.println("Menor: "+menor);
		} catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}
		teclado.close();
	}
}



