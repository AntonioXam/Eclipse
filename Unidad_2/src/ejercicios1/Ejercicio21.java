package ejercicios1;

import java.util.Scanner;

public class Ejercicio21 {

	final static int TOTAL=5; // Cantidad total de valores que vamos a leer por teclado

	public static void main (String[] argv) {

		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Introduce "+TOTAL+" números por teclado:");
			// Pedimos el primer número
			System.out.print("Dime el primero: ");
			int num=teclado.nextInt();
			int mayor, menor; // Declaramos las variables mayor y menor
			mayor=menor=num; // Inicializamos mayor y menor al primer número leído
			// Leemos el resto de números (nueve números)
			for (int i=1; i<TOTAL; i++) {
				System.out.print("Dime otro número: ");
				num=teclado.nextInt();
				// Actualizamos los valores de mayor y menor, si corresponde
				if (num>mayor)
					mayor=num;
				if (num<menor)
					menor=num;

			}
			// Mostramos por pantalla el mayor y el menor de los números que se han introducido
			System.out.println("Mayor número introducido: "+mayor);
			System.out.println("Menor número introducido: "+menor);
		} catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}
		teclado.close();
	}
}