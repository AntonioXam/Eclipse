package Ahorcado;

import java.util.Scanner;

public class AhorcadoTest {

	public static void main(String[] args) {

		AhorcadoPOO p=new AhorcadoPOO();
		
		char letra;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("---JUEGO DEL AHORCADO---\n\n");

		System.out.println("Número de letras de la palabra: "+p.getNumletrasPalabra());


		while(p.isAcertada()==false && p.getIntentos()<p.TOTAL_INTENTOS){
			System.out.println("\nPalabra a acertar: "+p.getPalabraMostrar());
			System.out.println("Nº de intentos: "+p.getIntentos());
			System.out.println("Nº de intentos restantes: "+p.getNumerodeIntentos());
			System.out.print("Introduce una letra: ");
			String cadena=sc.nextLine().toUpperCase();
			
				if(cadena.startsWith("RESUELVO:")) {
					if(p.resolver(cadena.substring(9)))
					System.out.println("\nACERTASTE!!! Has acertado la palabra! ENHORABUENA!!");
					

				else
					System.out.println("¡OOHH! no es la palabra correcta.");
			}else {
				 letra=cadena.charAt(0);
				 System.out.println("Letra introducida: "+letra);
				if(p.intentar(letra))
					System.out.println("¡ACERTASTE! La letra "+letra+" se encuentra en la cadena.");
				else
					System.out.println("¡OOHH! La letra "+letra+" no se encuentra en la cadena.");
			}

		}
		
		sc.close();
		
		if(p.isAcertada()) {
			
			System.out.println("Acertaste en "+p.getIntentos()+" intentos");
			System.out.println("La palabra es: "+p.getPalabraAcertar());
		}
		else
			System.out.println("La palabra es: "+p.getPalabraAcertar());
	}


}


