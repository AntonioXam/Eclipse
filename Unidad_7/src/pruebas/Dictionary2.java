
package pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Palabra a traduccir: ");
		String buscar=sc.nextLine().trim();
		sc.close();


		File f = new File("C:\\ProgramacionTXT\\dictionary.txt");
		try {

			boolean encontrado =false;
			Scanner s=new Scanner(f);
			while (s.hasNextLine() && !encontrado) {
				String linea = s.nextLine();
				String traduccion=linea.substring(linea.indexOf('=')+1);
				if (buscar.compareToIgnoreCase(traduccion)==0) { 
				String palabra=linea.substring(0, linea.indexOf('='));
				
					System.out.println("La traducción en inglés: "+palabra);
				encontrado=true;
				}
			}
			s.close();
			
			if (!encontrado) {
				System.out.println("No se ha encontrado");
			}

		} catch (FileNotFoundException e) {
			System.out.println("Se ha producido un error en el archivo");
		}


	}

}
