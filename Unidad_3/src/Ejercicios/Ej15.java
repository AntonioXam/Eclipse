package Ejercicios;

import java.util.Scanner;

public class Ej15 {

	final static int FILAS=3;
	final static int COLUM=3;

	public static void matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				System.out.print(matriz[i][j]+"\t");
			System.out.println();

		}

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {


			int matrizA[][]=new int[FILAS][COLUM];
			int matrizB[][]=new int[FILAS][COLUM];
			int matrizC[][]=new int[FILAS][COLUM];
			


			System.out.println("\nIntroduce numeros para matriz A : ");
			for (int i = 0; i < matrizA.length; i++) {
				for (int j = 0; j < matrizA[i].length; j++) {
					System.out.print("Valor Matriz A["+i+"]["+j+"]  : ");
					matrizA[i][j]=sc.nextInt();

				}
			}

			System.out.println("\nMatrizA: ");
			matriz(matrizA);


			System.out.println("\nIntroduce numeros para matriz B  : ");
			for (int i = 0; i < matrizB.length; i++) {
				for (int j = 0; j < matrizB[i].length; j++) {
					System.out.print("Valor Matriz B["+i+"]["+j+"]  : ");
					matrizB[i][j]=sc.nextInt();
				}
			}
			System.out.println("\nMatrizB: ");
			matriz(matrizB);

			for (int i = 0; i < FILAS; i++) {
				for (int j = 0; j < COLUM; j++) {
					matrizC[i][j]+=matrizA[i][j]+matrizB[i][j];
				}
			}


			System.out.println("\nMatriz A y B sumadas: ");
			matriz(matrizC);
			
		}catch (Exception e) {
			System.out.println("ERROR");
		}



		sc.close();
	}
}




