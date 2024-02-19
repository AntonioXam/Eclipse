package ejercicios02;

import java.util.Scanner;

public class Nueve {

	public static int random() {
		return (int)(Math.random()*100+1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int num, numActual, fallos=0;

		try {

			System.out.println("Intenta adivinar el número del 1 al 100...");
			num=random();
			System.out.println();

			do {
				System.out.print("Introduce un número: ");
				numActual=sc.nextInt();

				if(numActual>num) {
					System.out.println("El número es menor");
				}else if(numActual<num){
					System.out.println("El número es mayor");
				}
				fallos++;
				System.out.println();
			}while(numActual!=num);

			System.out.println("Felicidades el numero era "+num);
			System.out.println("Lo has adivinado en "+fallos+ " intentos");

		}catch (Exception e) {
			System.out.println("ERROR");
		}
		sc.close();
	}

}
