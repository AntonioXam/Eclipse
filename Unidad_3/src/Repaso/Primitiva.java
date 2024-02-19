package Repaso;


import java.util.Scanner;

public class Primitiva {

	final static int TAM=6;
	final static int LIM=49;
	
	
	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
		
	}
	
	public static void verArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}
	
	public static int compa(int[] arrayA, int[] arrayB) {
		int conta=0;
		
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				if (arrayA[i]==arrayB[j]) {
					conta++;	
					
				}
			}
		}
		return conta;
	
	}
	public static void burbujaPro(int array[]) {
		int aux;

		boolean cambio;  
		for (int i = array.length; i > 0; i--) {
			cambio=false;
			for (int j = 0; j < i-1; j++) {
				if (array[j]>array[j+1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
					cambio=true;
				}

			}
			if (cambio==false) 
				return;
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arrayA=new int[TAM];
		int[] arrayB=new int[TAM];
		
		for (int i = 0; i < arrayB.length; i++) {
			arrayB[i]=aleatorio(LIM);
		}
		
		try {

			System.out.println("Elige 6 apuestas para la lotería primitiva:");

			for (int i = 0; i < arrayA.length; i++) {
				do {	
					System.out.print("["+(i+1)+"] Número: ");
					arrayA[i]=sc.nextInt();
					if (arrayA[i]<1 || arrayA[i]>=49) {
						System.out.println("El número elegido no es válido. Debe estar entre 1 y 49");	
					}
				} while (arrayA[i]<1 || arrayA[i]>=49);
			}
			
		} catch (Exception e) {
			System.out.println("ERROR");
			
			System.out.println();
			System.out.print("Números apostados: ");
			burbujaPro(arrayA);
			verArray(arrayA);
			System.out.print("\nNúmeros ganadores: ");
			burbujaPro(arrayB);
			verArray(arrayB);
			System.out.print("\nNúmero de aciertos: "+compa(arrayA, arrayB));
		
		}

		sc.close();
	}

}
