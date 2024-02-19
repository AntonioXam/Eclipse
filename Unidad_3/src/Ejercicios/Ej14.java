package Ejercicios;

import java.util.Scanner;

public class Ej14 {
	
	final static int FILAS=5;
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
		
	    int sum=0;
		int matriz[][]=new int[FILAS][COLUM];
		
		System.out.println("Introduce numeros  : ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Valor["+i+"]["+j+"]  : ");
				matriz[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("\nMatriz: ");
	
		
		for (int i = 0; i < matriz.length; i++) {
			sum=0;
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
				sum+=matriz[i][j];
			}
			
			System.out.println("-->La suma de la fila ["+i+"] es igual a: "+sum);
			
		}
		

		}catch (Exception e) {
			System.out.println("ERROR");
		}
	
		
		
		sc.close();
	}
}




