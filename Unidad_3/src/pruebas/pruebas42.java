package pruebas;

import java.util.Scanner;

public class pruebas42 {

	final static int TAM=10;

	public static boolean encontra(int[] array,int N) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]==N) {
				return true;

			}
		}
		return false;

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array=new int[TAM];
		int num;
		try {
			System.out.println("Introduce "+TAM+" números enteros:");
			for (int i = 0; i < array.length; i++) {
				System.out.print("Valor ["+(i+1)+"]:");
				array[i]=sc.nextInt();
			}

			do {
				System.out.println("\nIntroduce un número positivo: ");
				num=sc.nextInt();
				if (num<0) {
					System.out.println("\nEl número introducido no es positivo.");
				}
		} while (num<0);
			
			
				
			if (encontra(array, num)) {
				System.out.println("\nEl "+num+" SÍ se encuentra entre los valores introducidos.");
			} else {
			System.out.println("\nEl "+num+" NO se ncuentra entre los valores introducidos.");
			}
		
			
			System.out.println();
			
			System.out.println("Valores introducidos:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		

	} catch (Exception e) {
		System.out.println("ERROR");
	}
	sc.close();


}

}
