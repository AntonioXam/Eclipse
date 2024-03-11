package clas;

import java.util.Scanner;

public class CriptografiaTest {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {


			System.out.print("Escribe un mensaje a cifrar:");
			String texto=sc.nextLine().trim();

			Criptografia m= new Criptografia(texto);
			String Cesar = m.cifrado_Cesar(texto);
			String Riel = m.cifrado_Riel(texto);
			
			System.out.println("\nCifrado del César: "+m.cifrado_Cesar(texto));
			System.out.println("Cifrado Transposición de Riel: "+m.cifrado_Riel(texto));

			System.out.println("\nDescifrado del César: "+m.descifrado_Cesar(Cesar));
			System.out.println("Descifrado Transposición de Riel: "+m.descifrado_Riel(Riel));





		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}

		sc.close();

	}
}


