package ejercicios;

import java.util.Scanner;

public class contarhastatunumero {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		try {

			System.out.print("Introduce un número:");
			int num=teclado.nextInt();

			if (num>=1) {
				for (int i=1;i<=num;i++){
					System.out.println(i);
				}	  		  
			}

		} catch (Exception e) {
			System.out.println("Error. Has introducido un número menor");
		}

		teclado.close();
	}

}
