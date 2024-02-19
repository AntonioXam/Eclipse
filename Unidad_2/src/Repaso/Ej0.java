package Repaso;

import java.util.Scanner;

public class Ej0 {

	public static boolean esprimo(int N) {
		int primo=Math.abs(N);
		for (int i = 2; i<=primo/2; i++) {
			if (primo%i==0)	
			return false;
			
		}
		return true;
		
	}
	
	
	public static long factorial(int N) {
		long fact=1;
		for (int i = N; i >=1; i--) {
			fact=fact*i;
			
			
		}
		return fact;
		
	}
	
	public static int mayordivisor(int N) {
		int mayord=Math.abs(N);
		for (int i = 2; i <=mayord/2; i++) {
			if (mayord%i==0) {
				mayord=i;
				
			}
			
		}
		return mayord;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int num;
			do {
				System.out.print("Introduce un numero del 1 al 10: ");
				num = sc.nextInt();
				if (num>10 || num<1) {
					System.out.println("Error.El numero.\n");
				}
			} while (num>10 || num<1);
			
			
			switch (num) {
			case 1: System.out.println("> UNO"); break;
			case 2: System.out.println("> DOS"); break;
			case 3: System.out.println("> TRES"); break;
			case 4: System.out.println("> CUATRO"); break;
			case 5: System.out.println("> CINCO"); break;
			case 6: System.out.println("> SEIS"); break;
			case 7: System.out.println("> SIETE"); break;
			case 8: System.out.println("> OCHO"); break;
			case 9: System.out.println("> NUEVE"); break;
			case 10: System.out.println("> DIEZ"); break;
			}
			
			if (esprimo(num)) {
				System.out.println("> "+num+" Es primo");
			} else {
				System.out.println("> "+num+" No es primo");
			}
			
			System.out.println("> "+num+"! = "+factorial(num));
			
			System.out.println("> Mayor divisor de "+num+": "+mayordivisor(num));



		} catch (Exception e) {
			System.err.println("ERROR!!");
		}

		sc.close();
	}

}
