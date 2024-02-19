package Ejercicios;


import java.util.Scanner;

public class Ej4 {

	final static int TOTAL=10;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int[] array=new int[TOTAL];
			
			System.out.println("Introduce"+TOTAL+" números de tipo entero: ");
			for (int i = 0; i < array.length; i++) {
				System.out.print("Valor ["+(i+1)+"] :");
				array[i]=sc.nextInt();
			}
			
			for (int i = 0; i < array.length/2; i++) {
				System.out.print(array[i]+" ");
				System.out.print(array[array.length-1-i]+" ");
				
			}
			
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();
	     
	
			
		}
	}

