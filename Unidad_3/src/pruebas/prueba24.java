package pruebas;

import java.util.Scanner;

public class prueba24 {

	
	public static boolean Primo(int N) {
		for (int i = 2; i <=N/2; i++) {
			if (N%i==0) {
				return false;
				
			}
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int conta=0;
		int num;
		try {
			do {
				System.out.println("Introduce:");
				num=sc.nextInt();
				if (num<1 || num>100) {
					System.out.println("no esta en el limite");
				}
			} while (num<1 || num>100);
			
			for (int i = 2; i <=num; i++) {
				if (Primo(i)) {
					conta++;
				}
				
			}
			
			System.out.println("entre 1 y "+num+"hay"+conta+"primos.");
			
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		sc.close();

	}

}
