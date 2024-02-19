package stringbuffer;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {


			System.out.print("Introduce una cadena de caracteres: ");
			String frase=sc.nextLine().trim();
			System.out.println("Introduce otra cadena de caracteres");
			String frase2=sc.nextLine().trim();
			
			sc.close();
			
			
			String fraseMAy=frase2.toUpperCase();
			
			
			frase=frase.replace(frase2, fraseMAy);
			
			
			System.out.println(frase);
			
			
		
			
			
			

		}catch (Exception e) {
			System.out.println("Error");
		}
			
			
	}

}
