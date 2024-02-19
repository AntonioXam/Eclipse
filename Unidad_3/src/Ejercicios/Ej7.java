package Ejercicios;

import java.util.Scanner;

public class Ej7 {

final static int TOTAL=10;
	
	public static void main(String[] args) {
		int[] array=new int[TOTAL];
		int elemento=0,posicion=0;
		Scanner sc = new Scanner(System.in);
		try {
			
			
			System.out.println("Introduce"+TOTAL+" números de tipo entero: ");
			for (int i = 0; i < 8; i++) {
				System.out.print("Valor ["+(i+1)+"] :");
				array[i]=sc.nextInt();
			}
			
			System.out.print("\nDime un nuevo elemento: ");
				elemento=sc.nextInt();
				
				
			do {
				System.out.print("\nDime una posición:");
				posicion=sc.nextInt();	
			} while (posicion<0 || posicion>8);
				
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();
	     
	    for (int i = 7; i >=posicion-1; i--) {
	    	array[i+1]=array[i];
	    	
		} 
	    
	    array[posicion-1]=elemento;
	    
	    System.out.println("\nArray: ");
	    for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	   
	}

}
