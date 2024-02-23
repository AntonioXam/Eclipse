package Wrappers;

import java.util.Scanner;

public class Capicua {

	public static boolean esCapicua(int num) {
		
		String numero=Integer.valueOf(num).toString();
		String inverso=new StringBuffer(numero).reverse().toString();
		
		return numero.equals(inverso);
			
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int num=Integer.parseInt(sc.nextLine());
		
	
		if(esCapicua(num))
			
			System.out.println("Tu numero es capicua");
		else
			System.out.println("No es capicua");

		sc.close();
	}

}
