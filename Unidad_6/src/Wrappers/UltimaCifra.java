package Wrappers;

import java.util.Scanner;

public class UltimaCifra {
	
	
	public static int getUltimaCifra(int num) {
		String numero=String.valueOf(num);
		int n=Integer.parseInt(numero.substring(numero.length()-1, numero.length()));
		return n;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un numero: ");
		int num=Integer.parseInt(sc.nextLine());
		
		System.out.println("El ultimo numero es: "+getUltimaCifra(num));
		sc.close();

	}

}
