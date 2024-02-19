package pruebas;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class prueba14 {

	
	public static int diasmes(int mes) {
		int diasmes=31;
		if (mes<1 || mes>12) {
			diasmes=0;
		}
		if (mes==2) {
			diasmes=28;
		}
		if (mes==4 || mes==5 || mes==9 || mes==11) {
			diasmes=30;
		}
		return diasmes;
		
	}
	
	public static boolean fecha(int dia,int mes,int año) {
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
		
			 
		
		int dia,mes,año;
		
		System.out.println("Introduce dd/mm/aa: ");
		System.out.print("Dia: ");
		dia=sc.nextInt();
		System.out.print("Mes: ");
		mes=sc.nextInt();
		System.out.print("Año: ");
		año=sc.nextInt();
		
		if (fecha(dia, mes, año)) {
			System.out.println("correcta");
			System.out.println("dias"+diasaño(dia, mes));
		} else {
			System.out.println("incorrecta");
		}
		
		
		
	}

}
