package Repaso;

import java.util.Scanner;

public class ComparaArrays {

	final static int TAM=5;

	public static boolean compa(int[]arrayA, int[] arrayB) {
		for (int i = 0; i < arrayB.length; i++) {
			if (arrayA[i] != arrayB[i]) {
				return false;
			}
		}
		return true;
	}
	public static void array(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			
		}
		
	}
	
	public static void burbujaPro(int array[]) {
		int aux;

		boolean cambio;  //Tomará el valor true cuando se introduzca un intercambio de valores
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

		try {
			int arrayA[]=new int[TAM];
			int arrayB[]=new int[TAM];
			
			System.out.println("Introduce valores para ArrayA: ");
			for (int i = 0; i < TAM; i++) {
				System.out.print("Valor ["+(i+1)+"] : ");
				arrayA[i]=sc.nextInt();
			}
			System.out.println("\nIntroduce valores para ArrayB: ");
			for (int i = 0; i < TAM; i++) {
				System.out.print("Valor ["+(i+1)+"] : ");
				arrayB[i]=sc.nextInt();
			}
			
			System.out.print("\nArray A--> ");
			array(arrayA);
			System.out.print("\nArray B--> ");
			array(arrayB);
			
			System.out.println();
			
			if (compa(arrayA, arrayB))
				System.out.println("\n>>Los arrays son iguales.");
				
			else 
				System.out.println("\n>>Los arrays son distintos.");
			
			
			burbujaPro(arrayA);
			burbujaPro(arrayB);
			
			if (compa(arrayA, arrayB))
				System.out.println("\n>>Los arrays contienen los mismos valores.");
				
			else 
				System.out.println("\n>>Los arrays contienen valores distintos.");
			
			
		}catch (Exception e) {
			System.out.println("ERROR");
		}

		sc.close();
	}
}




