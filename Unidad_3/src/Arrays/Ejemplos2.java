package Arrays;

import java.util.Scanner;

public class Ejemplos2 {

	public static void imprimir(int[] array ) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     
		try {
			int[] A=new int[10];
		
			 int[] B= {10, 20 ,30 , 40};
			 
			 int C[]=new int[10];
			  C[1]=56;
			 
			 imprimir(A);
			 
			 System.out.println();
			 imprimir(B);
			
			 System.out.println();
			 
			 System.out.println("\nLongitud de A: "+A.length);
			 System.out.println("Longitud de B: "+B.length);
			
		    System.out.println(C[1]);
		    
		    for (int i = 0; i < A.length; i++) {
		    	A[i]=i+1;
				
			}for (int i = 0; i < A.length; i++) {
				System.out.print("A=");
				System.out.print(A[i]+" ");
			}
		    
			
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();
	}

}
