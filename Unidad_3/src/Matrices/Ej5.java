package Matrices;

import java.util.Scanner;

public class Ej5 {

	final static int TAM=3;

	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}

	public static void matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				System.out.print(matriz[i][j]+"\t");
			System.out.println();
		}

	}
	
	/**
	 * El mayor valor almacenado en una matriz de numeros enteros
	 * @param M array bidimensional de numeros enteros
	 * @return el mayor almacenado en la matriz
	 */
	public static int mayor(int matriz[][]) {
		int mayor=matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				if(mayor<matriz[i][j])
					mayor=matriz[i][j];
				
		}
		return mayor;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int matriz[][]=new int[TAM][TAM];



		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Valor "+"["+i+"]["+j+"]"+" :");
				matriz[i][j]=sc.nextInt();
			}
		}

		System.out.println();

		System.out.println("Matriz : ");
		matriz(matriz);
		
		System.out.println("\nEl mayor numero de la matriz es:"+mayor(matriz));
		
		
		sc.close();
	}
}
