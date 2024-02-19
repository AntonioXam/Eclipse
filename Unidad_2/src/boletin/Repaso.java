package boletin;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		try {

			int num, par=0, impar=0, error=0, pos=0, neg=0;
			int mayor, menor;

			do {
				System.out.print("Dime un número: ");
				num=teclado.nextInt();
				if (num<-100 || num>100) {
					System.out.println("No has introducico un valor en rango");
					error++;
				}

			}while (num<-100 || num>100);


			mayor=menor=num;

			while(num!=0) {

				if(num>=-100 && num<=100) {

					if(num%2==0) {
						System.out.println(num+" Es par");
						par++;
					}else {

						System.out.println(num+" Es impar");
						impar++;
					}
					if(num<0) {
						System.out.println(num+" Es negativo");
						neg++;
					}else {
						System.out.println(num+" Es positivo");
						pos++;
					}
					if(num>mayor)
						mayor=num;
					if (num<menor)
						menor=num;


				}else {
					System.out.println("No has introducico un valor en rango");
					error++;
				}

				System.out.print("Dime un número: ");
				num=teclado.nextInt();
			}


			System.out.println("> Positivos: "+pos);
			System.out.println("> Negativos: "+neg);
			System.out.println("> Par: "+par);
			System.out.println("> impar: "+impar);
			System.out.println("> mayor: "+mayor);
			System.out.println("> menor: "+menor);
			System.out.println("> error: "+error);

		}catch(Exception e) {
			System.out.println("Error!!!");
		}

		teclado.close();
	}

}
