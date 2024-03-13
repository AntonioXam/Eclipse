package agendaClase;

import java.util.Scanner;

public class agendaApp {

	private static void menu() {
		
		System.out.println("AGENDA TELEFONICA");
		System.out.println("-----------------");
		System.out.println("1. Añadir nuevo contacto");
		System.out.println("2. Listar contactos");
		System.out.println("3. Buscar contacto");
		System.out.println("4. Eliminar contacto");
		System.out.println("5. Estado de la agenda");
		System.out.println("6. Salir");
		
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		
		//Creamos la agenda
		Agenda a=new Agenda(5);
		
		try {
			
		 do {
			 //Mostramos el menud
			 menu();
			 System.out.print("Elige una opción: ");
			 opcion=sc.nextInt();
			 switch (opcion) {
			case 1: System.out.println("\n>> Introduce un nuevo contacto");
				break;
			case 2: System.out.println("\n>> Listado de contactos");
					a.listarContactos();
				break;
			case 3: System.out.println("\n>> Introduce el contacto a buscar: ");
				break;
			case 4: System.out.println("\n>> Introduce el contacto a eliminar: ");
				break;
			case 5: System.out.println("\n>> Estado de la Agenda");
				break;
			case 6: System.out.println("\n>> Bye Bye...");
			break;
			default:System.out.println("\n>> No es correcto");
				break;
			}
			
		} while (opcion!=6);
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR. No has introducido un valor correcto");
		}
		
		sc.close();
		
		
		
	}

}
