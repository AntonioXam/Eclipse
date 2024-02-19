package Scanner;

//Importar Scanner
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// crear el lector
		Scanner teclado = new Scanner(System.in);
		
		// Se pide que introduzca su nombre
		System.out.print("Introduce tu nombre: ");
		String nombre= teclado.nextLine();
		// Se pide que introduzca su edad
		System.out.print("Introduce tu Edad: ");
		int edad= teclado.nextInt();
		// Lo mostramos por pantalla
		System.out.println("Nombre: "+nombre+" Edad: "+edad);
				
				
				
				
				
				
				
				
				
		// Cerramos scanner		
		teclado.close();		
	}

}
