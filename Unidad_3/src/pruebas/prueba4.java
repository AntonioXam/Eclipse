package pruebas;


import java.util.Scanner;

public class prueba4 {

	public static boolean encuentra(int array[],int n) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]==n) 
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int num;
		int array[]=new int[10];
		try {
			
		for (int i = 0; i < array.length; i++) {
			System.out.print("Valor["+(i+1)+"]: ");
			array[i]=sc.nextInt();
		}	
			do {
				System.out.print("\nIntroduce un número positivo: ");
				num=sc.nextInt();
				if (num<0) {
					System.out.println("\nEl número introducido no es positivo.");
					
				}
			} while (num<0);
			
			for (int i = 0; i < array.length; i++) {
				if (encuentra(array, num)) {
					System.out.println("\nEl "+num+" se encuentra entre los valores introducidos.");break;
				} else {
					System.out.println("\nEl "+num+" no se encuentra entre los valores introducidos.");break;
				}
			}
			System.out.println("\nValores introducidos: ");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
			
		} catch (Exception e) {
			System.out.println("Error");
		}
		
		sc.close();

	}

}
