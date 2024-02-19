package ejercicios1;

import java.util.Scanner;

public class Ejercicio14 {

	public static int digitos(int N) {
		int conta=0;
		
		while (N>0) {
			conta++; 
			N=N/10;}
		return conta;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
	
			System.out.print("Introduce un número ");
			int num = sc.nextInt();
			
			System.out.println("El número tiene:  "+digitos(num)+" digitos");
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("Error");
		}
		sc.close();
	}

}
