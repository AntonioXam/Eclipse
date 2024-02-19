package pruebas;

import java.util.Scanner;

public class Prueba1 {

	public static int mes(int mes) {
		int diasmes=31;
		if (mes<1 || mes>12) {
			diasmes=0;
		}
		if (mes==2) {
			diasmes=28;
		}
		if (mes==4 || mes==6 || mes==9 || mes==11) {
			diasmes=30;
		}
		return diasmes;
		
	}
	public static boolean Fechas(int dia,int mes,int año) {
		if (año==0) {
			 return false;
		}
		if (mes<1 || mes>12) {
			return false;
		}
		int diasmes=30;
		if (diasmes==2) {
			diasmes=28;
		}
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			diasmes=31;
		}
		if (dia<1 || dia>diasmes) {
			return false;
			
		}
		return true;
	}
	
	
		
	public static int dias(int dias,int mes) {
		int suma=0;
		for (int i = 1; i < mes; i++) {
			suma+=mes(i);
		}
		suma+=dias;
		return suma;
		
	}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try {
				 
			
			int dia,mes,año;
			
			System.out.println("Introduce dd/mm/aa: ");
			System.out.print("Dia: ");
			dia=sc.nextInt();
			System.out.print("Mes: ");
			mes=sc.nextInt();
			System.out.print("Año: ");
			año=sc.nextInt();
			
			if (Fechas(dia, mes, año)) {
				System.out.println("La fecha es correcta.");
				System.out.print("Nº de dia es:"+dias(dia, mes));
				
				
			} else {
				System.out.println("La fecha introducida no es correcta.");
			}
			
			
				
			} catch (Exception e) {
				System.out.println("ERROR!. Has introducido un valor no válido.");
			}
		   
		     sc.close();
		}

	}
