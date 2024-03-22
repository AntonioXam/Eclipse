package pruebas;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscrituraFinalNombre {

	public static void main(String[] args) {
		
		FileWriter fw= null;
		PrintWriter pw=null;
		
		try {
			fw= new FileWriter("C:/ProgramacionTXT/pruebafin.txt");
			pw= new PrintWriter(fw);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce texto (para acabar teclea FIN): ");
			String cadena=sc.nextLine();
			while (!cadena.equalsIgnoreCase("FIN")) {
				pw.println(cadena);
				cadena=sc.nextLine();
				
			}
			
			
			sc.close();
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
