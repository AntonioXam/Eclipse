package ejercicios1;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try { // Pedimos el primer número
			System.out.print("Dime el primer número: ");
			int num=sc.nextInt();
			// Si el número introducido no es el cero
			if (num!=0) {
				// Creamos mayor y menor y las inicializamos con el valor del primer número leído
				int mayor=num, menor=num;
				// Leemos números hasta que se teclee el cero
				while (num!=0) {
					// Actualizamos los valores de mayor y menor, si corresponde
					if (num>mayor)
						mayor=num;
					if (num<menor)
						menor=num;
					System.out.print("Dime otro número: ");
					num=sc.nextInt();
				}
				// Mostramos por pantalla el mayor y el menor de los números que se han introducido
				System.out.println("Mayor número introducido: "+mayor);
				System.out.println("Menor número introducido: "+menor);

			} else

				System.out.println("Has introducido el CERO.");

		} catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}
		sc.close();
	}



}


