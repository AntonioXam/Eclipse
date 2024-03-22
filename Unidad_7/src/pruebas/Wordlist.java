package pruebas;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Wordlist {

	public static void main(String[] args) {
	
		//Pedimos al usuario que introduzca la palabra buscar
		Scanner sc= new Scanner(System.in);
		System.out.print("Palabra a buscar: ");
		String palabra=sc.nextLine();
		sc.close();
		
		
		//Buscamos la palabra en el listado de palabras
		try {
			boolean encontrado =false;
			//Lectura del listado de palabras
			Scanner s= new Scanner(new File("C:/ProgramacionTXT/wordlist.txt"));
			while (s.hasNext() && !encontrado) {
				String linea = s.nextLine();
				if (palabra.compareToIgnoreCase(linea)==0) 
				encontrado=true;
			}
			s.close();
			
			// Indicamos si se ha encontrado o no la palabra en el listadao de palabras
			System.out.println("La palabra '"+palabra.toLowerCase()+"'");
			
			if(encontrado) {
				System.out.println(" SI encuentra en nuestro Wordlist");
			} else {
				System.out.println("NO se encuentra en nuestro Wordlist");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Se ha producido un error con el archivo especificado");
		}

	}

}
