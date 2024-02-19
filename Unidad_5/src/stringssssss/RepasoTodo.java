package stringssssss;

public class RepasoTodo {

	// Devolver una cadena invertida
	public static String invertido (String cadena) {
		String cadInv = "";
		for (int i = cadena.length()-1; i >= 0; i--) {
			cadInv = cadInv + cadena.charAt(i);
		}
		return cadInv;
	}

	/**
	 * Devuelve el número de veces que la subcadena se encuentra en cadena
	 * se hace en un metodo usando cadena de atributo
	 * @return - int número de veces
	 */
	public int findCadena(String busca) {
		int apariciones = 0;
		int posicion = 0;

		while (posicion>=0) {
			//	posicion=cadena.indexOf(busca,posicion); 
			if(posicion>=0) {				
				apariciones++;
				posicion++;
			}
		}
		return apariciones;
	}

	// encontrar una cadena y cambiarla para ponerlo en mayusculas
			// String subcadenaMayus = subcadena.toUpperCase();
		// cadena = cadena.replace(subcadena, subcadenaMayus);


	// Añadir un string/palabra al final de otro String 
	// copiar asi en metodos 
	// public static String añadirPalabra(String palabra) {
	// cadena = cadena+palabra;
	// }

	/**
	 * FORMA DE COGER SOLO 1 CARACTER POR TECLADO
	 * System.out.print("Introduce una letra: ");
		del = sc.next().charAt(0); del es una variable char
	 * 
	 */

	// Contar vocales en un string
	public static int contarVocales(String cadena) {
		int conta = 0;
		char c;

		for (int i = 0; i < cadena.length(); i++) {
			c = cadena.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				conta++;
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				conta++;
		}
		return conta;
	}

	// Contar el número de consonantes
	public static int contarConsonantes(String cadena) {
		int conta = 0;
		char c;
		for (int i = 0; i < cadena.length(); i++) {
			c = cadena.charAt(i);
			if(c >= 'b' && c <= 'z') {
				if(c!= 'e' && c!= 'i' && c!= 'o' && c!= 'u')
					conta++;
			}
			if(c >= 'B' && c <= 'Z') {
				if(c!= 'E' && c!= 'I' && c!= 'O' && c!= 'U')
					conta++;
			}
		}
		return conta;
	}

	// Devuelve solo las vocales de un String
	public static String imprimirVocales(String cadena) {
		String resultado = "";
		char c;

		for (int i = 0; i < cadena.length(); i++) {
			c = cadena.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				resultado+=c;
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				resultado+=c;
		}
		return resultado;
	}

	// Devuelve solo las consonantes de un String
	public static String imprimirConsonantes(String cadena) {
		String resultado = "";
		char c;
		for (int i = 0; i < cadena.length(); i++) {
			c = cadena.charAt(i);
			if(c >= 'b' && c <= 'z') {
				if(c!= 'e' && c!= 'i' && c!= 'o' && c!= 'u')
					resultado += c;
			}
			if(c >= 'B' && c <= 'Z') {
				if(c!= 'E' && c!= 'I' && c!= 'O' && c!= 'U')
					resultado += c;
			}
		}
		return resultado;
	}

	// Eliminar un caracter de una cadena
	public static String eliminar(String cadena, char c) {
		String resultado = "";
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) != c)
				resultado+=cadena.charAt(i);
		}
		return resultado;
	}

	// Toda la cadena en mayusculas
	public static String mayusculas(String cadena) {
		return cadena.toUpperCase();
	}

	// Toda la cadena en minisculas
	public static String minusculas(String cadena) {
		return cadena.toLowerCase();
	}

	// Imprimir los valores de un array(si no son STRING cambiar a (int nombre[])
	public static void impArray(String nombre[]) {
		for (int i = 0; i < nombre.length; i++) {
			System.out.print(nombre[i]+" ");
		}
	}

	// Ordenar un array DE NUMEROS
	public static void ordenar(int array[]) {
		int aux;
		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if(array[j] > array[j+1]) {
					aux = array[j+1];
					array[j+1] = array[j];
					array[j] = aux;
				}
			}

		}
	}

	// Devuelve el mayor valor de un array de numeros
	public static int mayor(int array[]) {
		int may = array[0];
		for (int i = 1; i < array.length; i++) {
			if(may < array[i])
				may = array[i];
		}
		return may;
	}

	// Devuelve el menor valor de un array de numeros
	public static int menor(int array[]) {
		int men = array[0];
		for (int i = 1; i < array.length; i++) {
			if(men < array[i])
				men = array[i];
		}
		return men;
	}

	// Devuelve la posicion (NUMERO) del String mas largo dentro del array
	public static int mayor(String array[]) {
		int may = 0;
		for (int i = 1; i < array.length; i++) {
			if(array[i].length() > array[may].length())
				may = i;
		}
		return may;
	}

	// Devuelve la posicion (NUMERO) del String mas corto dentro del array
	public static int menor(String array[]) {
		int men = 0;
		for (int i = 1; i < array.length; i++) {
			if(array[i].length() < array[men].length())
				men = i;
		}
		return men;
	}

	// Ordena el array por orden alfbetico A-Z
	public static void burbuja(String nombre[]) {
		String aux;
		for (int i = nombre.length; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if(nombre[j].compareTo(nombre[j+1]) > 0) {
					aux = nombre[j];
					nombre[j] = nombre[j+1];
					nombre[j+1] = aux;
				}
			}
		}
	}

	// Nombre elegido al azar por el metodo random
	public static void nombreAleatorio(String nombre[]) {
		// CAMBIAR EL 10 POR LA VARIABLE ASIGNADA AL ARRAY
		// FINAL STATIC INT TOTAL = 5; (ESTO)
		System.out.println(nombre[(int)(Math.random()*10)]);
	}

}
