package estructurasBasicasControlEJERCICIOS;

import java.util.Scanner;

public class funcionesvarias {
	
	public static void NumToLetter(int N) {
		switch(N) {
			case 1:System.out.println("> Euros");
			break;
			case 2:System.out.println("> centimos");
			break;
			case 3:System.out.println("> billetes");
			break;
		
		}
	}
	
	public static boolean EsPrimo(int N) {
		for (int primo = 2; primo <=N/2; primo++) {
			if (N%primo==0) {
				return false;
			}
		}return true;
	}
	
	public static long Factorial(int N) {
		long facto=1;
		for (int i = N; i >=1; i--) {
			facto*=i;
		}
		return facto;
	}
	
	public static int MayorDivisor(int N) {
		int mdiv=1;
		for (int i = 2; i <=N/2; i++) {
			if (N%i==0) {
				mdiv=i;
			}
		}return mdiv;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			int num;
			
			do {
				System.out.print("Introduce un número: ");
				num=sc.nextInt();
				
				if (num<1 || num>10) {
					System.out.println("Error: el número introducido no está entre 1 y 10.\n");
				}
			} while (num<1 || num>10);
						
			NumToLetter(num);
			
			if (EsPrimo(num)) {
				System.out.println("> "+num+" es primo.");
			}else {
				System.out.println("> "+num+" no es primo.");
			}
			
			System.out.println("> "+num+" ! = "+Factorial(num));
			System.out.println("> Mayor divisor de "+num+" = "+MayorDivisor(num));
			
			
		
			
		} catch (Exception e) {
			System.out.println("Error: Caracter no válido.");
		}
		sc.close();
	}

}
