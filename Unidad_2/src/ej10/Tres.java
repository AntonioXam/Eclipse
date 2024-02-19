package ej10;

import java.util.Scanner;

public class Tres {
	
	public static boolean fecha(int dia, int mes, int año) {
		if(año==0) {
			return false;
		}
		if(mes<1 || mes>12) {
			return false;
		}
		int dias_mes=30;
		if(mes==2) {
			dias_mes=28;
		}
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			dias_mes=31;
		}
		if(dia<1 || dia > dias_mes) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			int dia, mes, año;
			
			System.out.print("Introduce un dia: ");
			dia=sc.nextInt();
			System.out.print("Introduce un mes: ");
			mes=sc.nextInt();
			System.out.print("Introduce un año: ");
			año=sc.nextInt();
			
			if(fecha(dia, mes, año)) {
				System.out.println("La fecha "+dia+"/"+mes+"/"+año+" es correcta");
			}else {
				System.out.println("La fecha es incorrecta");
			}
	
		} catch (Exception e) {
			System.out.println("Error");
		}
		sc.close();
	}

}
