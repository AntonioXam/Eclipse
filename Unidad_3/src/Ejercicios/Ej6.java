package Ejercicios;

import java.util.Scanner;

public class Ej6 {
	

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
	     
	     boolean creciente;
	     boolean decreciente;
	     creciente =false;
	     decreciente=false;
	     
	     
		for (int i = 0; i < array.length-1; i++) {
			if (array[i]> array[i+1]) 
				decreciente=true;
			if (array[i]< array[i+1])
				creciente=true;
			
	
		}
		System.out.println();
		
		if(creciente==true && decreciente==false)
			System.out.println("Creciente");
		if (creciente==false && decreciente==true)
			System.out.println("Decreciente");
		if(creciente==true && decreciente==true)
			System.out.println("Desordenado");
		if(creciente==false && decreciente==false)
			System.out.println("Iguales");
			
		}
	
	}
	
