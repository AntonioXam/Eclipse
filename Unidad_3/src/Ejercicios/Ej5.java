package Ejercicios;

import java.util.Scanner;

public class Ej5 {

	
	final static int Total=5;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			 int[] A=new int[Total];
			 int[] B=new int[Total];
			 int[] C=new int[Total+Total];
			 
			System.out.println("Introduce "+Total+" números : ");
			
			System.out.println("Valores de A:");
			for (int i = 0; i < A.length; i++) {
				System.out.print("Valor ["+(i+1)+"] :");
				A[i]=sc.nextInt();
				
			}
			System.out.println("Valores de B: ");
			for (int i = 0; i < B.length; i++) {
				System.out.print("Valor ["+(i+1)+"] :");
				B[i]=sc.nextInt();
				
			}
			
			int j=0;
			
			for (int i = 0; i < (Total); i++) {
				C[j++]=A[i];
				C[j++]=B[i];
			
				
			}
			
            System.out.println("Mostramos C: ");
            for (int i = 0; i < C.length; i++) {
            	System.out.print(C[i]+" ");
				
			}
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();
	}

}
