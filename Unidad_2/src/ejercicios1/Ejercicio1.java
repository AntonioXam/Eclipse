package ejercicios1;

import java.util.Scanner;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Introduce un número: ");
			int a=sc.nextInt();
			System.out.print("Introduce otro número: ");
			int b=sc.nextInt();
			if (a<b) {
			System.out.println("El menor número es:"+a);
			} else {
				System.out.println("El menor número es: "+b);
			}
			
		} catch (Exception e) {
			System.out.println("Error!!");
		}
		sc.close();

	}

}
