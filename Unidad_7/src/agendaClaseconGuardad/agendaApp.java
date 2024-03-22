package agendaClaseconGuardad;

import java.util.Scanner;

import agendaClase.Agenda;

public class agendaApp {

	private static void menu() {

		System.out.println("AGENDA TELEFONICA");
		System.out.println("-----------------");
		System.out.println("1. Añadir nuevo contacto");
		System.out.println("2. Listar contactos");
		System.out.println("3. Buscar contacto");
		System.out.println("4. Eliminar contacto");
		System.out.println("5. Estado de la agenda");
		System.out.println("6. Guardar agenda");
		System.out.println("7. Salir");

	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion=0;
		String nombre;
		//Creamos la agenda
		Agenda a=new Agenda(5);

		try {

			do {
				System.out.println();
				//Mostramos el menud
				menu();

				System.out.print("\nElige una opción: ");
				opcion=Integer.parseInt(sc.nextLine());
				switch (opcion) {
				case 1: 
						System.out.println("\n>> Introduce un nuevo contacto");
						System.out.print("Nombre: ");
						 nombre=sc.nextLine();
						System.out.print("Teléfono: ");
						int tlf=Integer.parseInt(sc.nextLine());
						Contacto c=new Contacto(nombre,tlf);
						a.addContacto(c);
				
				break;
				case 2: System.out.println("\n>> Listado de contactos");
						a.listarContactos();
				break;
				case 3: System.out.print("\n>> Introduce el contacto a buscar: ");
						nombre=sc.nextLine();
						a.buscarContacto(nombre);
							
				break;
				case 4: System.out.println("\n>> Introduce el contacto a eliminar: ");
						nombre=sc.nextLine();
						a.eliminarContacto(new Contacto(nombre));
						
				break;
				case 5: System.out.println("\n>> Estado de la Agenda");
						if(a.agendaLlena())
							System.out.println("La agenda esta llena");
						else
							if(a.huecosLibres()<5)
							System.out.println("Hay "+a.huecosLibres()+" huecos libres ");
							else
							System.out.println("Agenda vacia "+a.huecosLibres()+" huecos libres");
				break;
				case 6: System.out.println("Agenda guardada");
				a.guardarContactos();
				
				case 7: System.out.println("\n>> Bye Bye...");
				break;
				default:System.out.println("\n>> Opción no válida");
				break;
				}

			} while (opcion!=6);



		} catch (Exception e) {
			System.out.println("ERROR. No has introducido un valor correcto");
		}

		sc.close();



	}

}
