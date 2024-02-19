package Repaso;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Introduce 10 números: ");
			int num=sc.nextInt();
			int mayor,menor;
			mayor=menor=num;
			
			for (int i = 1; i <10; i++) {
				System.out.print("Dame otro número: ");
				num=sc.nextInt();
				
				if (num>mayor) 
					mayor=num;
				if (num<menor) 
					menor=num;
				
				
			}
				System.out.println("El numero mayor es: "+mayor);
				System.out.println("El numero menor es: "+menor);
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		sc.close();
	}

}
