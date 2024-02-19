package Ejercicios2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		// Generar un número aleatorio entre 1 y 100
		int numeroSecreto = (int)(Math.random()*100+1);

		System.out.println("¡Bienvenido a Adivina el Número Secreto!");
		System.out.println("Intenta adivinar el número secreto entre 1 y 100.");

		int intentos = 0;
		int intentoUsuario = 1;

		// Bucle while para permitir múltiples intentos
		try {
			while (intentoUsuario != numeroSecreto) {
				System.out.print("Ingresa tu intento: ");
				intentoUsuario = scanner.nextInt();
				intentos++;

				// Comprobar si el intento es correcto
				if (intentoUsuario == numeroSecreto) {
					System.out.println("¡Felicidades! ¡Has adivinado el número secreto en " + intentos + " intentos!");
					
				} else if (intentoUsuario < numeroSecreto) {
					System.out.println("El número es más alto. Sigue intentando.");
				} else {
					System.out.println("El número es más bajo. Sigue intentando.");
				}
			}
		} catch (Exception e) {
			System.out.println("Eso no es un numero melón");
		}
		// Cerrar el scanner
		scanner.close();
	}
}



