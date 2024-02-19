package Scanner;

import java.util.Scanner;
public class Scanner4 {


	public static void main (String[] args) {

		Scanner teclado = new Scanner(System.in);
		try {

			// Introduce nombre del producto
			System.out.print("Nombre del producto: ");
			String nombre = teclado.nextLine();

			// Precio del producto
			System.out.print("Precio (€): ");
			float precio = teclado.nextFloat();
			
			// Cantidad de productos
			System.out.print("Cuantos productos quieres? ");
			int cant= teclado.nextInt();

			// Introducir descuento
			System.out.print("Descuento (%): ");
			int desc = teclado.nextInt();

			// Calculamos el precio final con descuento
			float precioreducido = (precio*cant)*(100-desc)/100;
			System.out.println("Precio del producto y con descuento "+nombre+" es: "+precioreducido+"€");
		}
		catch (Exception e) {
			System.err.println("ERROR. No has introducido un valor válido.");
		}

		teclado.close();
	}
}