import java.util.Scanner;


public class Ejercicio1pizzarra {



	private static boolean esvocal(char c) {
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
			return true;
		return false;

	}
	private static boolean esconsonante(char c) {

		if(esvocal(c))
			return false;
		if(c>='b' && c<='z')
			return true;
		if(c>='B' && c<='Z')
			return true;
		return false;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int vocales=0;
			int consonantes=0;
			System.out.print("Introduce tu nombre: ");
			String nombre=sc.nextLine().trim();

			System.out.println("Nombre: "+nombre);
			System.out.print("Invertido: ");
			for(int i=nombre.length()-1; i>=0; i--)
				System.out.print(nombre.charAt(i));
			System.out.println();
			System.out.print("Nº vocales: ");
			for(int i=0; i<nombre.length(); i++) {
				char c=nombre.charAt(i);
				if(esvocal(c)) {
					vocales++;	
				}
			}
			System.out.print(vocales);

			System.out.print("\nVocales: ");
			for(int i=0; i<nombre.length(); i++) {
				char c=nombre.charAt(i);
				if(esvocal(c)) {
					System.out.print(nombre.charAt(i));
				}
			}

			System.out.println();

			System.out.print("Nº Consonantes: ");
			for(int i=0; i<nombre.length(); i++) {
				char c=nombre.charAt(i);
				if(esconsonante(c)) {
					consonantes++;	
				}
			}
			System.out.print(consonantes);

			System.out.print("\nConsonantes: ");
			for(int i=0; i<nombre.length(); i++) {
				char c=nombre.charAt(i);
				if(esconsonante(c)) {
					System.out.print(nombre.charAt(i));
				}
			}

			System.out.println();

			System.out.println("Minúsculas "+nombre.toLowerCase());
			System.out.println("Mayúsculas "+nombre.toUpperCase());

			System.out.println();

			System.out.print("Dime un carácter a eliminar: ");
			char caracter=sc.next().charAt(0);
			String nombreNuevo= "";
			for (int i = 0; i < nombre.length(); i++) {
				char c = nombre.charAt(i);
				if(c!=caracter)
					nombreNuevo+=c;
			}

			System.out.println("Nombre sin "+caracter+" "+nombreNuevo);

		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}

		sc.close();

	}

}
