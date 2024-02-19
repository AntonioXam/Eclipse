package Menus;

import java.util.Scanner;

public class Menu02 {

	private static void menu() {
		System.out.println("\n----- MENU -----");
		System.out.println("Elige una operación: ");
		System.out.println("1) Suma ");
		System.out.println("2) Resta ");
		System.out.println("3) Multiplicación ");
		System.out.println("4) División ");
		System.out.println("5) Potencia ");
		System.out.println("6) Salir ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			int opcion,num1,num2;
	
			do {
				menu();
				System.out.print("Elige una opción: ");
				opcion=sc.nextInt();
				
				switch (opcion) {
				case 1:
					System.out.println("\n--SUMA--");
					System.out.print("Dime el primer sumando: ");
					num1=sc.nextInt();
					System.out.print("Dime el segundo sumando: ");
					num2=sc.nextInt();
					System.out.println(num1+" + "+num2+" = " +(num1+num2)); break;
				case 2:
					System.out.println("\n--RESTA--");
					System.out.print("Dime el primer número: ");
					num1=sc.nextInt();
					System.out.print("Dime el segundo número: ");
					num2=sc.nextInt();
					System.out.println(num1+" - "+num2+" = "+(num1-num2));break;
				case 3:
					System.out.println("\n--MULTIPLICACION--");
					System.out.print("Dime el primer multiplicador: ");
					num1=sc.nextInt();
					System.out.print("Dime el segundo multiplicador: ");
					num2=sc.nextInt();
					System.out.println(num1+" x "+num2+" = "+(num1*num2));break;
				case 4:
					System.out.println("\n--DIVISION--");
					System.out.print("Dime el primer dividendo: ");
					num1=sc.nextInt();
					System.out.print("Dime el segundo divisor: ");
					num2=sc.nextInt();
					System.out.println(num1+" x "+num2+" = "+(double)(num1/num2));break;
				case 5:
					System.out.println("\n--POTENCIA--");
					System.out.print("Dime el primer Base: ");
					num1=sc.nextInt();
					System.out.print("Dime el segundo Potencia: ");
					num2=sc.nextInt();
					System.out.println(num1+" ^ "+num2+" = "+(int)Math.pow(num1, num2));break;
				case 6:
					System.out.println("Saliendo del sistema...");break;
				default: System.out.println("No es una opción válida.");break;
					
				}
				
			} while (opcion!=6);
			
			
		} catch (Exception e) {
			System.out.println("ERROR! comando no valido.");
		}
	     sc.close();
	}

}
