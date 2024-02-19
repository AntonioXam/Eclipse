package ejercicios1;

import java.util.Scanner;

public class Ejercicio12 {

	public static long factorial(int N) {
		long fact=1;
		for (int i=N; i>0; i--) {
		fact=fact*i;
		}
		return fact;
		}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	     
	     try {
			
	     System.out.println("Introduce un numero para hallar el factorial: ");
	     int i = sc.nextInt();
	     System.out.print("Su facotial es: "+factorial(i));
	     
	} catch (Exception e) {
		System.out.println("Error");
	     
	     sc.close();
	}
	}
}
