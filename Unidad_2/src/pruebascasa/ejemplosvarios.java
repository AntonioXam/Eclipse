package pruebascasa;

import java.util.Scanner;

public class ejemplosvarios {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int altura=0;

		try {
			do {
				System.out.print("Introduce un numero entero: ");
				altura = sc.nextInt();

				//Indicamos que la altura introducida no está comprendido
				if(altura<3) {
					System.out.println("--> No puedes introducir un valor menor que 3.\n");
				}else if(altura>10){
					System.out.println("--> No puedes introducir un valor mayor que 10.\n");

					//si lo está, hacemos funcionar el programa
				}else {


					//Comprobamos si la altura es numero primo o no
					boolean primo=true;
					for(int i = 2; i<=altura/2; i++) {
						if(altura%i==0) {
							primo=false;
						}
					}

					//Mostramos si la altura es numero primo ono
					if(primo) {
						System.out.println("--> El numero es primo");
					}else {
						System.out.println("--> No es primo.");
					}


					//Calculamos y mostramos el factorial de altura
					int resultado=1;
					for(int i=altura; i>=1; i--) {
						resultado *= i;
					}
					System.out.println("--> El factorial es: "+resultado);

					//Calculamos y mostramos el mayor divisor de altura
					int mayord=1;
					for(int i=1; i<=altura/2; i++) {
						if(altura%i==0) {
							mayord=i;
						}
					}

					System.out.println("--> El mayor divisor es: "+mayord+"\n");
				}


			}while (altura<3 || altura>10);
		} catch(Exception e) {
			System.out.println("Error en la toma de datos, no has introducido un numero. Sinverguenza.");
		}

		sc.close();
	}
}


