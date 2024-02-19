package Simulacro;

import java.util.Scanner;



public class pruebaboletin1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int num;
			int positivo=0;
			int negativo=0;
			int mayor;
			int menor;
			int pares=0;
			int impares=0;
			int errores=0;

			do {
				System.out.print("Introduce un número: ");
				num = sc.nextInt();
				if (num>100 || num<-100) {
					System.out.println(">Error. El número introducido no esta en -100 y 100.\n");
					errores++;
				}
			} while(num>100 || num<-100);

			mayor=menor=num;


			while (num!=0) {

				if(num<=100 && num>=-100){

					if (num>0) {
						System.out.print(num+" > Es positivo\n");
						positivo++;

					} else {
						System.out.print(num+" > Es negativo\n");
						negativo++;
					} if (num%2==0) {
						System.out.print(num+" > Es par\n");
						pares++;


					} else {
						System.out.print(num+" > Es impar\n "); 
					}
					impares++;
					if (num>mayor) 
						mayor=num;
					if(num<menor)
						menor=num; 
				}else {
					System.out.println(">Error. El número introducido no esta en -100 y 100.\n");
					errores++; }

				System.out.println();

				System.out.print("Introduce un número: ");
				num = sc.nextInt();

			}



			System.out.println("\n>Positivos: "+positivo);
			System.out.println(">Negativos: "+negativo);
			System.out.println(">Pares: "+pares);
			System.out.println(">Impares: "+impares);
			System.out.println(">Mayor: "+mayor);
			System.out.println(">Menor: "+menor);
			System.out.println(">Fuera de rango (-100....100): "+errores);





		} catch (Exception e) {
			System.out.println("Error. Caracter no valido.");
		}

		sc.close();

	}

}
