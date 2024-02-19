package Ejercicios;

import java.util.Scanner;

public class Ej8 {
	final static int TOTAL=5;
	
	public static void main(String[] args) {
		int[] array=new int[TOTAL];
		Scanner sc = new Scanner(System.in);
		try {
			
			
			System.out.println("Introduce"+TOTAL+" números de tipo entero: ");
			for (int i = 0; i < array.length; i++) {
				System.out.print("Valor ["+(i+1)+"] :");
				array[i]=sc.nextInt();
			}
			
			
		
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();
	     
	     System.out.println("\nTabla original");
	     
	     for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
	     
	   int ultimo=array[array.length-1];
	     
	   for (int i = array.length-2; i >=0; i--) {
		  array[i+1]=array[i];
	}
	      array[0]=ultimo;
			
	    System.out.println("\nTabla nueva");
	    
	    for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	     
	}

}
