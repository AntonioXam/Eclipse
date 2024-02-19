package Menus;

import java.util.Scanner;

public class Menu01 {
	/*
	 * Procedimiento que muestra el menu
	 */
	private static void menu() {
		System.out.println("\n----- MENU -----");
		System.out.println("1) Opción 1 ");
		System.out.println("2) Opción 2 ");
		System.out.println("3) Opción 3 ");
		System.out.println("4) Salir ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int opcion;
			do {
				menu();
				do {
					System.out.print("Elige una opción: ");
					opcion=sc.nextInt();
					//Ejecutamos la opcion
					switch (opcion) {
					case 1: System.out.println("Has elegido la opción 1.");break;
					case 2: System.out.println("Has elegido la opción 2.");break;
					case 3: System.out.println("Has elegido la opción 3.");break;
					case 4: System.out.println("Saliendo del sistema...");break;
					default:System.out.println("La opción elegida no es válida");break;
					}
				}while (opcion<1 || opcion>4);

			} while (opcion!=4);
		} catch (Exception e) {
			System.out.println("Error!!");
		}
		sc.close();
	}
}
