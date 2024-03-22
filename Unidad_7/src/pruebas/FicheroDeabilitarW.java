package pruebas;

import java.io.File;

public class FicheroDeabilitarW {

	public static void main(String[] args) {

		File f = new File("C:\\ProgramacionTXT\\100tifiko.txt");

		if(!f.exists())
			System.out.println("El fichero "+f.getPath()+" no existe");
		else {
			if(f.canWrite())
				System.out.println("El fichero existe y se puede escribir");
			if(f.setWritable(true)) {
				System.out.println("Desabilitaremos el permiso de escritura del fichero "+f.getPath());
			}else {
				System.out.println("La operacion ha fallado");
				System.out.println("El usuario no tiene los permisos para realizar la operacion");
			}
			if(f.canWrite())
				System.out.println("Podemos escribir en el fichero "+f.getName());
			else
				System.out.println("Ya no podemos escribir en el fichero "+f.getName());
		}
	}
}
