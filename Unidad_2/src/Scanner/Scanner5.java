package Scanner;

import java.util.Scanner;

public class Scanner5 {

	public static void main(String[] args) {
		// Creamos scanner
		Scanner teclado = new Scanner(System.in);

		try {
			// Leemos nombre
			System.out.print("Datos del alumno: \nNombre: ");
			String nombre= teclado.nextLine();
			
			//Leemos Edad
			System.out.print("Edad: ");
			int edad=teclado.nextInt();
			
			//leemos nota
			System.out.print("Nota: ");
			float nota=teclado.nextFloat();
			
			//Mostramos los datos 
			System.out.println("El alumno "+nombre+" de edad "+edad+" tiene una nota media de: "+nota);

		} catch (Exception e) {
			// TODO: exception
		}

		teclado.close();
	}

}
