package pruebas;

import java.io.FileReader;

public class ejercicioEliminarEspacios {

	public static void main(String[] args) {

		FileReader fr = null;

		try {

			// Apertura del fichero y creacion de los bufferReeader
			fr = new FileReader("C:\\ProgramacionTXT\\100tifiko.txt");

			// Leemos caracter a caracter
			int valor= fr.read();
			while(valor != -1) {
				if(valor != ' ')
				System.out.print((char)valor);
				valor = fr.read();
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
