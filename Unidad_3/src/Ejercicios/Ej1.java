package Ejercicios;

import java.util.Scanner;

public class Ej1 {
	
	final static int TOTAL=10; //Número de elementos del array
	
	public static void main(String[] args) {
		
		
		int[] vector = new int[TOTAL];
		
		Scanner sc = new Scanner(System.in);
		try {
			for (int i=0; i<TOTAL; i++) {
				System.out.print("Valor ["+(i+1)+"] :");
				vector[i]=sc.nextInt();
			}
		} catch (Exception e) {

			System.out.println("Error en la introducción de datos");

		}
		sc.close();
		
		// Mostramos los números en el mismo orden en el que se introdujeron
		System.out.println("\nNúmeros (en el orden de introducción): ");
		
		for (int i=0; i<TOTAL; i++) {
			System.out.print(vector[i]+" ");
		}
		// Mostramos los números en el orden inverso en el que se introdujeron
		System.out.println("\nNúmeros (en orden inverso): ");
		
		for (int i=TOTAL-1; i>=0; i--) {
			System.out.print(vector[i]+" ");
		}
	}
}