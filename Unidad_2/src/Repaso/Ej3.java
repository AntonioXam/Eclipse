package Repaso;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un valor: ");
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println(num+" Es multiplo de 2"); }
		if (num%3==0) {
			System.out.println(num+" Es multiplo de 3"); }
		if (num%5==0) {
			System.out.println(num+" Es multiplo de 5"); }
		if (num%7==0) {
			System.out.println(num+" Es multiplo de 7"); }
	     
	     
	     sc.close();

	}

}
