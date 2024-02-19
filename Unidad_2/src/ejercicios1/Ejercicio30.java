package ejercicios1;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try { // Pedimos el primer número
			System.out.print("Dime un número: ");
			int num=teclado.nextInt();
			// Leemos números hasta que se teclee el cero
			while (num!=0) {
				if (num>0) {
					if (Ejercicio28.esprimo(num))
						System.out.println("> Es primo. ");
					else
						System.out.println("> No es primo. ");

				} else {
					System.out.println("ERROR: No es un entero positivo!");
				}
				System.out.print("Dime otro número: ");
				num=teclado.nextInt();
			}
			System.out.println("FIN");
		} catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}
		teclado.close();
	}


}


