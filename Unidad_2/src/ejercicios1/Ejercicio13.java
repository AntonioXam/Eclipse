package ejercicios1;

import java.util.Scanner;

public class Ejercicio13 {
	
		/**
		* Procedimiento que visualiza por pantalla la tabla de multiplicar de un número entero
		* @param N (no entero)
		*/
		static void tabla_multiplicar (int N) {
		for (int conta=1; conta <= 10; conta++)
		System.out.println(N+"x"+conta+"="+(N*conta));

		}
		public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
		int num;

		// Pedimos un número hasta que el introducido esté entre 1 y 10
		do {
		System.out.print("Introduce un número: ");
		num=teclado.nextInt();
		} while (num<1 || num>10);
		// Mostramos la tabla de multiplicar del último número introducido
		tabla_multiplicar(num);
		} catch (Exception e) {
		System.out.println("ERROR: No has introducido un valor válido.");
		}
		teclado.close();
		}
		}