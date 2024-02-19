package boletin;

import java.util.Scanner;

public class boletin4 {

	final static int COLUM=3;
	final static int FIL=3;


	private static void menu() {
		System.out.println("\n----- MENU -----");
		System.out.println("Elige una opción: ");
		System.out.println("1) Introducir valores de la matriz A ");
		System.out.println("2) Introducir valores de la matriz B ");
		System.out.println("3) Mostrar los valores almacenados en la matriz A ");
		System.out.println("4) MostrSaar los valores almacenados en la matriz B ");
		System.out.println("5) sumar matrices A+B ");
		System.out.println("6) Indicar si las matrices A y B son iguales. ");
		System.out.println("7) Salir. ");
	}
	public static void matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				System.out.print(matriz[i][j]+"\t");
			System.out.println();
		}

	}

	public static void sumar(int matrizA[][], int matrizB[][],int matrizC[][]) {
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {

				matrizC[i][j]=matrizA[i][j]+matrizB[i][j];
			}

		}

	}

	public static boolean compa(int matrizA[][], int matrizB[][]) {
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (matrizA[i][j] != matrizB[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		try {
			int[][] matrizC=new int[COLUM][FIL];
			int[][] matrizA=new int[COLUM][FIL];
			int[][] matrizB=new int[COLUM][FIL];
			int opcion;
			
			menu();
			do {

				System.out.print("Elige una opción: ");
				opcion=sc.nextInt();
				
				switch (opcion) {
				
				case 1:
					for (int i = 0; i < matrizA.length; i++) {
						for (int j = 0; j < matrizA[i].length; j++) {
							System.out.print("Valor: ");
							matrizA[i][j]=sc.nextInt();
						}
					}
					break;
				case 2:
					for (int i = 0; i < matrizB.length; i++) {
						for (int j = 0; j < matrizB[i].length; j++) {
							System.out.print("Valor: ");
							matrizB[i][j]=sc.nextInt();
						}
					}
					break;
				case 3:
					matriz(matrizA);
					break;
				case 4:
					matriz(matrizB);
					break;
				case 5:
					sumar(matrizA, matrizB, matrizC); 
					matriz(matrizC);
					break;
				case 6:
					if (compa(matrizA, matrizB))
						System.out.println("\n>>Las matrices son iguales.");

					else 
						System.out.println("\n>>Las matrices son distintas.");
					break;
				case 7:System.out.println(">> FIn. Bye");break;
				default: System.out.println("No es una opción válida.");break;
				}
				
			} while (opcion!=7);

		} catch (Exception e) {
			System.out.println("ERROR! comando no valido.");
		}
		sc.close();
	}

}
