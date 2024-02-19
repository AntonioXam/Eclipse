package Repaso;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Introduce la hora : ");
			int hora = sc.nextInt();
			System.out.print("Introduce los minutos : ");
			int min = sc.nextInt();
			System.out.print("Introduce los segundos : ");
			int seg = sc.nextInt();

			if (hora<=23 && hora>=0) {
				if(min<=59 && min>=0) {
					if(seg<=59 && seg>=0) 
						System.out.println("La hora es correcta: "+hora+":"+min+":"+seg); 
					else 
						System.out.println("La segundos son incorrectos.");
				} else 
					System.out.println("La minutos son incorrectos.");
			}	else 
				System.out.println("La hora son incorrecta.");





		} catch (Exception e) {
			System.out.println("Error");
		}

		sc.close();
	}

}


