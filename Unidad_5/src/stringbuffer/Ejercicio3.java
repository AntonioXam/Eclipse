package stringbuffer;


import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		try {


			System.out.print("Introduce una cadena de caracteres: ");
			String frase=sc.nextLine().trim();
			System.out.println("Introduce otra cadena de caracteres");
			String frase2=sc.nextLine().trim();

			sc.close();
			
			int pos=0;
			int conta=0;
			while(pos>=0)
				pos=frase.indexOf(frase2, pos);
				if (pos>=0) {
					conta++;
					pos++;
				}
			
			


			System.out.println(conta);

		}catch (Exception e) {
			System.out.println("Error");
		}

		

	}

}
