package pruebas;

import java.util.Scanner;

public class Pruebas12 {


	public static int diasmes(int mes) {
		int diasmes=31;
		if (mes<1 || mes>12) {
			diasmes=0;
		}
		if (mes==2) {
			diasmes=28;
		}
		if (mes==4 || mes==5 || mes==7 || mes==11) {
			diasmes=30;

		}
		return diasmes; 

	}

	static boolean fecha(int dia,int mes,int año) {
		if (año==0) {
			return false;
		}
		if (mes<1 || mes>12) {
			return false;

		}
		if (dia<1 || dia>diasmes(mes)) {
			return false;
		}
		return true;
	}

	public static int diasaño(int dia,int mes) {
		int suma=0;
		for (int i = 1; i < mes; i++) {
			suma+=diasmes(i);
		}
		return suma+=dia;

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			int dia,mes,año;
			System.out.println("Introduce dd/mm/aa:");
			System.out.print("Dia: ");
			dia=sc.nextInt();
			System.out.print("Mes: ");
			mes=sc.nextInt();
			System.out.print("Año: ");
			año=sc.nextInt();

			if (fecha(dia, mes, año)) {
				System.out.println("La fecha es correcta.");
				System.out.println("Nº de dia: "+diasaño(dia, mes));
			} else {
				System.out.println("La fecha introducida no es correcta.");
			}

		} catch (Exception e) {
			System.out.println("ERROR");
		}

		sc.close();

	}

}
