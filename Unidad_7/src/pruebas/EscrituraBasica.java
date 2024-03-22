package pruebas;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscrituraBasica {

	public static void main(String[] args) {
		
		FileWriter fw= null;
		PrintWriter pw=null;
		
		try {
			fw= new FileWriter("C:/ProgramacionTXT/prueba.txt");
			pw= new PrintWriter(fw);
			
			//Escritura en el fichero
			pw.println("Prueba de escritura en un fichero");
			for (int i = 0; i <10; i++) 
				pw.println("Linea "+i);
			
			
		} catch (Exception e1) {
			System.out.println("Se ha producido un error con el archivo especificado");
		} finally {
			try {
				if (fw!=null) {
					fw.close();
				}
			} catch (Exception e2) {
				System.out.println("Error en el cierre del archivo");
			}
		}

	}

}
