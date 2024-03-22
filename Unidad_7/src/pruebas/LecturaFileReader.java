package pruebas;

import java.io.BufferedReader;
import java.io.FileReader;

public class LecturaFileReader {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;

		try {

			// Apertura del fichero y creacion de los bufferReeader
			fr = new FileReader("C:\\ProgramacionTXT\\100tifiko.txt");
			br = new BufferedReader(fr);

			// Lectura del fichero 
			String linea = br.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

		} catch (Exception e1) {
			System.out.println("Se ha producido un error con el archivo especificado");
		} finally {
			try {
				if(fr != null)
					fr.close();
			} catch (Exception e2) {
				System.out.println("Error en el cierre del archivo");
			}
		}

	}

}
