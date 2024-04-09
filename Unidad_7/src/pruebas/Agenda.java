package pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Agenda {

	private static String fichero="C:/ProgramacionTXT/agenda.txt";

	private static void menu() {

		System.out.println("************************");
		System.out.println("*  AGENDA TELEFONICA   *");
		System.out.println("*  1. Nuevo contacto   *");
		System.out.println("*  2. Listar contactos *");
		System.out.println("*  3. Buscar contacto  *");
		System.out.println("*  4. Salir            *");
		System.out.println("************************");

	}

	/**
	 * Guarda en el fichero un nuevo contacto
	 * @param nombre el contacto
	 * @param tlf del contacto
	 */
	private static void newContacto(String nombre,int tlf) {

		FileWriter fw= null;
		PrintWriter pw=null;

		try {
			fw= new FileWriter(fichero, true);
			pw= new PrintWriter(fw);

			//Escritura en el fichero
			pw.println(nombre+" > "+tlf);




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

	/**
	 * Mostrar los contactos de la agenda
	 */
	private static void listarContactos() {

		File f = new File(fichero);


		try {
			Scanner sc = new Scanner(f);
			int conta=0;
			while(sc.hasNextLine()) {
				String linea = sc.nextLine();
				conta++;
				System.out.println(conta+". "+linea);
			}


			sc.close();
			if (conta==0) {
				System.out.println("Agenda vacia");

			}

		} catch (FileNotFoundException e) {
			System.out.println("La agenda está vacia.");
		}

	}


	/**
	 * Busca un contacto en la agenda por su nombre
	 * @param nombre del contacto a buscar
	 * @return el telefono del contacto si existe, 0 en otro caso
	 */
	private static int buscarContactos(String nombre) {
		int res=0;
		
		File f = new File(fichero);
		try {
			boolean encontrado =false;
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine() && !encontrado) {
				String linea = sc.nextLine();
				String name=linea.substring(0, linea.indexOf('>')).trim();
				if (nombre.compareToIgnoreCase(name)==0) {
					String telefono=linea.substring(linea.indexOf('>')+1).trim();
					res=Integer.parseInt(telefono);
					encontrado=true;
				}
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			return 0;
		}
		return res;
	}


	public static void main(String[] args) {

		int opcion;
		String nombre;
		int telefono;

		Scanner sc = new Scanner(System.in);
		try {

			do {
				menu();
				System.out.print("Elige una opción: ");
				opcion=Integer.parseInt(sc.nextLine());

				switch (opcion) {
				case 1: System.out.println("\n>> NUEVO CONTACTO"); 
				System.out.print(">> Nombre: ");
				nombre=sc.nextLine().trim();
				if (buscarContactos(nombre)>0) {
					System.out.println("El contacto ya existe.");
				} else {
				System.out.print(">> Teléfono: ");
				telefono=Integer.parseInt(sc.nextLine());
				newContacto(nombre, telefono);
				}
				break;
				case 2: System.out.println("\n>> LISTAR CONTACTO");
				System.out.println();
				listarContactos();
				break;
				case 3: System.out.println("\n>> BUSCAR CONTACTO");
						System.out.print(">> Nombre: ");
						nombre=sc.nextLine().trim();
						int telf=buscarContactos(nombre);
						if (telf==0) {
							System.out.println(">> No se ha encontrado '"+nombre+"' en la agenda");
						}else {
							System.out.println(">> Teléfono: "+telf);
						}
						
						
				break;
				case 4: System.out.println("\nBye Bye ....");
				break;
				default:System.out.println("\n>> Opción incorrecta. Elige otra opción"); 
				break;

				}
				System.out.println("\n");
			} while (opcion!=4);





		} catch (Exception e) {
			System.out.println("ERROR. No has introducido un valor correcto");
		}

		sc.close();


	}

}
