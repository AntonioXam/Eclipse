package pruebascasa;


public class locrua {

	public static void main(String[] args) {
		  // Definimos un número para el ejemplo
        int numero = 7;

        // Usamos la estructura if con cinco posibilidades
        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else if (numero == 0) {
            System.out.println("El número es cero.");
        } else if (numero > 0 && numero <= 10) {
            System.out.println("El número es positivo y está en el rango de 1 a 10.");
        } else if (numero > 10 && numero <= 20) {
            System.out.println("El número es positivo y está en el rango de 11 a 20.");
        } else {
            System.out.println("El número es positivo y es mayor que 20.");
        }

	}

}
