package pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FicheroLectura {

	public static void main(String[] args) {

		File f = new File("C:\\ProgramacionTXT\\100tifiko.txt");

		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String linea = sc.nextLine();
				System.out.println(linea);
			}
			
			
			sc.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("El sistema no encuentra el fichero");
		}

	}

}
