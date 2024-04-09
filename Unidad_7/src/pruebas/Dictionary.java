
package pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {

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
				String palabra=linea.substring(0, linea.indexOf('='));
				if (buscar.compareToIgnoreCase(palabra)==0) { 
				String traduccion=linea.substring(linea.indexOf('=')+1);
					System.out.println("La traducción: "+traduccion);
				encontrado=true;
				}
			}
			s.close();
			
			if (!encontrado) {
				System.out.println("No se ha encontrado en dictionary");
			}

		} catch (FileNotFoundException e) {
			System.out.println("Se ha producido un error en el archivo");
		}


	}

}
