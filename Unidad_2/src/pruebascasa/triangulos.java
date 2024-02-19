package pruebascasa;

import java.util.Scanner;

public class triangulos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la altura del triangulo: ");
		int altura = sc.nextInt();

		for(int i=1;i<=altura;i++) { 
			for(int m=1;m<=i;m++) {
			System.out.print("*"); 	}
		    	System.out.println(); }
		
	
	    System.out.println();
	    
	

		System.out.println();

		
		for(int i=altura; i>=1; i--) {
			for(int m=1;m<=i;m++) {
				System.out.print("*"); 	}
			    	System.out.println(); }

		
			System.out.println();
		



		
		for(int i=1; i<=altura; i++) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		for(int i=altura-1; i>=1; i--) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}


		System.out.println();


		
		
		for(int i=1; i<=altura; i++) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println();

	
		for(int i=altura; i>=1; i--) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println();


		for(int i=1; i<=altura; i++) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		for(int i=altura-1; i>=1; i--) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");

			}
			System.out.println(); }
		
		System.out.println();
		
			
		
			for(int i=1; i<=altura; i++) {
				for(int m=altura; m>i; m--) {
					System.out.print(" ");
				}
				for(int j=1; j<=2*i-1; j++) {
					System.out.print(i);

				}
				System.out.println();
			}

			for(int i=altura-1; i>=1; i--) {
				for(int m=altura; m>i; m--) {
					System.out.print(" ");
				}
				for(int j=1; j<=2*i-1; j++) {
					System.out.print(i);

				}
				System.out.println();
		}
		sc.close();
	}





}


