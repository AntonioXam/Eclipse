package Arrays;

import java.util.Scanner;

public class Ejemplos {

	final static int cant=5;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			 
		 int nums[]=new int[cant];
		 
		 System.out.println("Introduce "+cant+" numeros enteros...: ");
		 for (int i = 0; i <cant; i++) {
			 System.out.print("Valor ["+(i+1)+"]: ");
			 nums[i]=sc.nextInt();
		}
		 System.out.println();
		 
		 System.out.print("Arrays: ");
		 for (int i = 0; i <cant; i++) {
		 System.out.print(nums[i]+" "); }
		 
		 System.out.print("\nArrays: ");
		 for (int i = cant-1; i >=0; i--) {
		 System.out.print(nums[i]+" "); }
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();
	}

}
