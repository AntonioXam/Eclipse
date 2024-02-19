package pruebas;

import java.util.Scanner;

public class pureba44 {

	final static int TAM=10;
	public static boolean encuentra(int[] array,int N) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]==N) {
				return true;
				
			}
		}
		return false;
		
	}
	
	public static void array(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]array= new int[TAM];
		int num;
		try {
			System.out.println("INtroduce 10 nuemse: ");
			
			for (int i = 0; i < array.length; i++) {
				System.out.print("VAlor: ");
				array[i]=sc.nextInt();
			}
			
			do {
				System.out.print("Itnrduce: ");
				num=sc.nextInt();
				if (num<0) {
					System.out.println("no es positivio");
				}
			} while (num<0);
			
		
			if (encuentra(array, num)) {
				System.out.println("Esta entre ellos");
			} else {
				System.out.println("No esta entre ellos");
			}
			
			
			array(array);
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		sc.close();
		
	}

}
