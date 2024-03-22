
package pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("Palabra a traduccir: ");
		String buscar=s.nextLine();
		s.close();
		
		
		File f = new File("C:\\ProgramacionTXT\\dictionary.txt");
		try {
			boolean encontrado =false;
			Scanner sc=new Scanner(f);
			while (s.hasNext() && !encontrado) {
				String palabra = s.nextLine();
				if (buscar.equalsIgnoreCase(palabra)) 
				encontrado=true;
			}
			
			
			String palabra=linea.substring(0,linea.indexOf("="));
			String traduccion=linea.substring(linea.indexOf("=")+1);
			System.out.println(palabra);
			System.out.println(traduccion);
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Se ha producido un error en el archivo");
		}

		
	}

}
