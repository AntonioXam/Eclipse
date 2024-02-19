package Menus;

import java.util.Scanner;

public class Menu03 {

	public static void menu() {
		System.out.println("\n-----MENU-----");
		System.out.println("Elige una opción:");
		System.out.println("1) Introducir un número N");
		System.out.println("2) Mostrar el número introducido N");
		System.out.println("3) Contar de 1 hasta N");
		System.out.println("4) Mostrar los divisores de N");
		System.out.println("5) Mostar la tabla de multiplicar de N");
		System.out.println("6) Salir");
	}
	
	public static void conta(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(i+" ");
		}
	}
	
	public static void div(int n) {
		for(int i=1; i<=n/2; i++) {
			if(n%i==0)
				System.out.print(i+" ");
		}
	}
	
	public static void tabla(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(i+" x "+n+" = "+(i*n));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numMenu, N=0;
		boolean intro= false;
		try {
			do {
				menu();
				do {
					System.out.print("Elige una opción: ");
					numMenu=sc.nextInt();
					if(numMenu<1 || numMenu>6)
						System.out.println("Introduce un número correcto");
				} while (numMenu<1 || numMenu>6);

				switch(numMenu) {
				case 1: do { 
					System.out.println("Introduce un número: ");
					N=sc.nextInt();
					if(N<0)
						System.out.println("Introduce un número positivo");
				}while(N<0);
				intro=true;break;
				case 2: if(intro==false) {
					System.out.println("Introduce primero un número");
				}else {
					System.out.println("El número introducido es: "+N);
				}
				break;
				case 3: if(intro==false) {
					System.out.println("Introduce primero un número");
				}else {
					conta(N);
				}
				break;
				case 4: if(intro==false) {
					System.out.println("Introduce primero un número");
				}else {
					div(N);
				}
				break;
				case 5: if(intro==false) {
					System.out.println("Introduce primero un número");
				}else {
					tabla(N);
				}
				break;
				case 6: System.out.println("Saliendo...");break;
				}

			}while(numMenu!=6);

		} catch (Exception e) {
			System.out.println("Error");
		}
		sc.close();
	}

}
