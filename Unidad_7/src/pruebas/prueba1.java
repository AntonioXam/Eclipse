package pruebas;

import java.io.File;

public class prueba1 {

	public static void main(String[] args) {

		File f = new File("C:\\ProgramacionTXT\\100tifiko.txt");

		if(!f.exists())
			System.out.println("El fichero "+f.getPath()+" no existe");
		else {
			System.out.println("Ruta: "+f.getAbsolutePath());
			System.out.println("permisos del fichero "+f.getName()+":");
			
			System.out.print("Lectura: ");
			if(f.canRead())
				System.out.println("Permitida");
			else
				System.out.println("No permitida");
			
			System.out.print("Escritura: ");
			if(f.canWrite())
				System.out.println("Permitida");
			else
				System.out.println("No permitida");
			
			System.out.print("Ejecucion: ");
			if(f.canExecute())
				System.out.println("Permitida");
			else
				System.out.println("No permitida");
			
		}


	}

}
