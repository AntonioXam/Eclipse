package ejercicios02;

import java.util.Scanner;

public class Siete {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			int i, sus=0;
			double nota;

			for(i=1; i<=5; i++) {
				do {
				System.out.print("Dime una nota: ");
				nota=sc.nextDouble();
				if(nota<1 || nota > 10)
					System.out.println("La nota introducida no es correcta");
				}while(nota < 1 || nota > 10);
				
				if(nota<5) {
					sus++;
				}
			}
			if(sus==1)
				System.out.println("Hay "+sus+" suspenso");
			else if(sus>1)
				System.out.println("Hay "+sus+" suspensos");
			else
				System.out.println("Todos estan aprobados");

			sc.close();
		}catch (Exception e) {
			System.out.println("Error");
		}
	}

}
