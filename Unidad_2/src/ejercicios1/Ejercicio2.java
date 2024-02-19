package ejercicios1;

import java.util.Scanner;

public class Ejercicio2 {

	public static int menor(int a, int b,int c) {
		if (a<b && a<c) 
			return a;
		else if (b<a && b<c) 
			return b;
		else 
			return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Introduce el primer número: ");
			int a=sc.nextInt();
			System.out.print("Introduce el segundo número: ");
			int b=sc.nextInt();
			System.out.print("Introduce el tercer número: ");
			int c=sc.nextInt();
			System.out.print("El menor de los 3 números es: "+menor(a, b, c));
			
		} catch (Exception e) {
			System.out.println("Error!!");
		}
		sc.close();

	}

}
