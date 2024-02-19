package Ejercicios;

import java.util.Scanner;

public class Ej10 {

final static int TOTAL=10; //Numero de elementos del array

	/**
	 *  Funcion mostrar el array
	 * @param array el array
	 * @param tam tamaño
	 */
	public static void imprime(int array[],int tam) {
		 for (int i = 0; i < tam; i++) {
				System.out.print(array[i]+" ");
			}
	}
	public static void main(String[] args) {
		
		int[] array=new int[TOTAL];
		int posicion=TOTAL;
		Scanner sc = new Scanner(System.in);
		try {
			
			
			System.out.println("Introduce"+TOTAL+" números de tipo entero: ");
			for (int i = 0; i < TOTAL; i++) {
				System.out.print("Valor ["+(i+1)+"] :");
				array[i]=sc.nextInt();
			}
			
			
			do {
				System.out.print("\nDime una posición en 0 y "+(TOTAL-1)+" :");
				posicion=sc.nextInt();	
			} while (posicion<0 || posicion>TOTAL-1);
				
		} catch (Exception e) {
			System.err.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();
	     
	     System.out.println("\nTabla Original: ");
		  imprime(array, TOTAL);
	     
	    for (int i = posicion-1; i <TOTAL-1; i++) {
	    	array[i]=array[i+1];
	    	
		} 
	   
	    System.out.println("\nTabla Modificada: ");
	    imprime(array, TOTAL-1);
	}

}
