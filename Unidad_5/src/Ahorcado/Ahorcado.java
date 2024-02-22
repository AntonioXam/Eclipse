package Ahorcado;
import java.util.Scanner;

public class Ahorcado {


	public static String palabras() {

		String[] array={"MANDALORIANO","BABY YODA","SUSPENSO","VICTORVERDU","IMPRESORA","FILAMENTO","EXTRUSOR"};

		String palabraAleatoria=array[(int)(Math.random()*array.length)];

		return palabraAleatoria;

	}


	public static boolean encontrado(String palabra,char c) {

		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)==c)
				return true;

		}
		return false;

	}

	public static void main(String[] args) {

		final int TOTAL_INTENTOS=10;
		int intentos=0;										
		String palabraAle=palabras();
		String palabraMotrar="";
		String cadena;
		char letra;
		boolean acertada=false;


		System.out.println("---JUEGO DEL AHORCADO---\n\n");


		for (int i = 0; i < palabraAle.length(); i++) {
			palabraMotrar+="*";

		}

		System.out.println("Numero de letras de la palabra a acertar: "+palabraAle.length());
		System.out.println();

		Scanner sc = new Scanner(System.in);

		while(intentos<TOTAL_INTENTOS && !acertada) {

			System.out.println("Palabra a acertar: "+palabraMotrar);
			System.out.println("Intentos realizados: "+intentos);
			System.out.println("Intentos restantes: "+(TOTAL_INTENTOS-intentos));

			System.out.println("Dime una letra: ");
			cadena=sc.nextLine().toUpperCase();
			if(cadena.startsWith("RESUELVO:")) {
				if(palabraAle.equals(cadena.substring(9)))
					acertada=true;
				else 
					System.out.println("¡OOHH la palabra introducida no es correcta.");
			} else {
				letra=cadena.charAt(0);
				System.out.println("Letra introducida: "+letra);

				if(palabraAle.indexOf(letra)==-1)
					System.out.println("¡ OOOHHH La letra "+letra+" no se encuentra en la palabra a acertar");
				else {
					System.out.println("¡ACERTASTE! La letra "+letra+" se encuentra en la palabra a acertar");
					for(int j=0; j<palabraAle.length();j++)
						if(palabraAle.charAt(j)==letra)
							palabraMotrar=palabraMotrar.substring(0,j)+letra+palabraMotrar.substring(j+1);
					if(palabraAle.equals(palabraMotrar))
						acertada=true;
				}
			}
			intentos++;
		}
		sc.close();

		if(acertada) {
			System.out.println("\n¡CORRECTO! !Has acertado la palabra! ¡Enhorabuena!");
			System.out.println("Acertaste la palabra en "+intentos+" intentos");
		} else 
			System.out.println("\n¡OHHH! Has agotado el número de intentos");
		System.out.println("La palabra es: "+palabraAle);

	}

}
