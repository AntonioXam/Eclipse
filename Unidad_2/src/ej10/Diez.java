package ej10;

import java.util.Scanner;

public class Diez {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		try {
			int sup=1,inf=100; // Límite superior e inferior sobre los que vamos a realizar la búsqueda.
			// Inicialmente, 1..100
			int num; // Guarda los números que va generando el programa.
			int fallos=0; // Guarda el número de intentos fallidos para adivinar el número
			boolean encontrado=false; // Tomará el valor true cuando hayamos encontrado el número
			int opcion; // Guarda la opción tecleada por el usuario
			System.out.println("Piensa un número entre 1 y 100 para que pueda adivinarlo...");
			while (!encontrado) {
				// Probamos con el número que se encuentra en mitad del intervalo de búsqueda
				// De esta forma, reducimos el espacio de búsqueda en cada intento a la mitad
				num=(sup+inf)/2;
				System.out.println("\nEs éste el número?: "+num);
				System.out.println("Pulsa: ");
				System.out.println("1) si "+num+" es el número que has pensado");
				System.out.println("2) si "+num+" es MENOR que el no que has pensado");
				System.out.println("3) si "+num+" es MAYOR que el no que has pensado");
				// Leemos la opción tecleada
				System.out.print ("Opción elegida: ");
				opcion=teclado.nextInt();
				switch (opcion) {
				case 1: encontrado=true; System.out.println("Encontrado!!"); break;
				case 2: sup=num; fallos++; break;
				case 3: inf=num; fallos++; break;
				default: System.out.println("La opción tecleada es incorrecta");
				}
			}
			System.out.println("Número de intentos fallidos: "+fallos);
		}
		catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}
		teclado.close();

	}

}
